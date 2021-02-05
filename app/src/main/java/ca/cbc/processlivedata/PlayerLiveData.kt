package ca.cbc.processlivedata

import android.content.Context
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.SimpleExoPlayer

class PlayerLiveData(
    private val appContext: Context,
    private val lifecycle: Lifecycle,
    private val mediaUrl: String = "https://html5demos.com/assets/dizzy.mp4",
    contentPosition: Long = 0L,
    playWhenReady: Boolean = true
) : LiveData<Player>(), DefaultLifecycleObserver {

    // Public access for state saving
    var contentPosition = contentPosition
        private set
    var playWhenReady = playWhenReady
        private set

    override fun onActive() {
        lifecycle.addObserver(this)
    }

    override fun onStart(owner: LifecycleOwner) {
        value = SimpleExoPlayer.Builder(appContext).build().apply {
            setMediaItem(MediaItem.fromUri(mediaUrl))
            prepare()
            seekTo(this@PlayerLiveData.contentPosition)
            playWhenReady = this@PlayerLiveData.playWhenReady
        }
    }

    override fun onStop(owner: LifecycleOwner) {
        tearDown()
    }

    override fun onDestroy(owner: LifecycleOwner) {
        lifecycle.removeObserver(this)
        tearDown()
    }

    private fun tearDown() {
        value?.run {
            this@PlayerLiveData.contentPosition = contentPosition
            this@PlayerLiveData.playWhenReady = playWhenReady
            release()
            value = null
        }
    }
}