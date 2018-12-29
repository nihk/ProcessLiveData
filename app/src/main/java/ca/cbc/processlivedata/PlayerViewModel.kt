package ca.cbc.processlivedata

import android.app.Application
import androidx.lifecycle.*

class PlayerViewModel(
    application: Application
) : AndroidViewModel(application), LifecycleOwner {

    // Alternatively expose this via a constructor dependency
    private val processLifecycle: Lifecycle = ProcessLifecycleOwner.get().lifecycle
    private val lifecycleRegistry = LifecycleRegistry(this)
        .also { it.markState(Lifecycle.State.CREATED) }
    val player = PlayerLiveData(application, startStop = processLifecycle, destroy = lifecycle)

    override fun getLifecycle(): Lifecycle = lifecycleRegistry

    override fun onCleared() {
        super.onCleared()
        lifecycleRegistry.markState(Lifecycle.State.DESTROYED)
    }
}