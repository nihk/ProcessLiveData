package ca.cbc.processlivedata

import android.content.Context
import android.net.Uri
import androidx.lifecycle.Lifecycle
import com.google.android.exoplayer2.ExoPlayerFactory
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.source.ExtractorMediaSource
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.util.Util

class PlayerLiveData(
    private val appContext: Context,
    startStop: Lifecycle,
    destroy: Lifecycle,
    private val mediaUrl: String = "https://html5demos.com/assets/dizzy.mp4",
    private val appName: String = "demo",
    contentPosition: Long = 0L,
    playWhenReady: Boolean = true
) : MultiLifecycleObserverLiveData<Player>(startStop, destroy) {

    // Public access for state saving
    var contentPosition = contentPosition
        private set
    var playWhenReady = playWhenReady
        private set

    override fun createResource(): Player {
        val dataSourceFactory = DefaultDataSourceFactory(
            appContext,
            Util.getUserAgent(appContext, appName)
        )

        val mediaSource = ExtractorMediaSource.Factory(dataSourceFactory)
            .createMediaSource(Uri.parse(mediaUrl))

        return ExoPlayerFactory.newSimpleInstance(appContext).apply {
            prepare(mediaSource)
            playWhenReady = this@PlayerLiveData.playWhenReady
            seekTo(this@PlayerLiveData.contentPosition)
        }
    }

    override fun tearDownResource() {
        with(value ?: return) {
            this@PlayerLiveData.contentPosition = contentPosition
            this@PlayerLiveData.playWhenReady = playWhenReady
            release()
        }
    }
}