package ca.cbc.processlivedata

import android.annotation.SuppressLint
import android.content.Context
import androidx.lifecycle.*

class PlayerViewModel(
    appContext: Context,
    processLifecycle: Lifecycle
) : LifecycleViewModel() {

    val player = PlayerLiveData(
        appContext = appContext,
        lifecycle = LifecycleDelegate(
            startStop = processLifecycle,
            destroy = lifecycle
        )
    )

    class Factory(
        private val appContext: Context,
        private val processLifecycle: Lifecycle
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            @Suppress("UNCHECKED_CAST")
            return PlayerViewModel(appContext, processLifecycle) as T
        }
    }
}

/**
 * Captures the lifecycle of a ViewModel, which is from the first onCreate until the last onDestroy
 * of a UI component (e.g. Activity or Fragment).
 */
abstract class LifecycleViewModel : ViewModel(), LifecycleOwner {
    @SuppressLint("StaticFieldLeak")
    private val registry = LifecycleRegistry(this).apply {
        currentState = Lifecycle.State.CREATED
    }

    override fun getLifecycle(): Lifecycle {
        return registry
    }

    override fun onCleared() {
        registry.currentState = Lifecycle.State.DESTROYED
    }
}