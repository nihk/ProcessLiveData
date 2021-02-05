package ca.cbc.processlivedata

import androidx.lifecycle.*

/**
 * A Lifecycle based on parts of other Lifecycles.
 *
 * This is useful to represent a lifecycle of a Player instance, which should do the following:
 * 1) Retain across config changes.
 * 2) Be released on the last onDestroy of the UI component it is used in.
 * 3) Tear down and recreate itself in response to application-level onStart and onStop events,
 *    respectively.
 *
 * In the above example, `startStop` would be the Application (process) lifecycle, and `destroy`
 * would be the lifecycle of a ViewModel.
 */
class LifecycleDelegate(
    private val startStop: Lifecycle,
    private val destroy: Lifecycle
) : Lifecycle(), LifecycleOwner, DefaultLifecycleObserver {

    private val registry = LifecycleRegistry(this)

    init {
        startStop.addObserver(this)
        destroy.addObserver(this)
    }

    override fun onStart(owner: LifecycleOwner) {
        if (owner.lifecycle == startStop) {
            registry.handleLifecycleEvent(Event.ON_START)
        }
    }

    override fun onStop(owner: LifecycleOwner) {
        if (owner.lifecycle == startStop) {
            registry.handleLifecycleEvent(Event.ON_STOP)
        }
    }

    override fun onDestroy(owner: LifecycleOwner) {
        if (owner.lifecycle == destroy) {
            registry.handleLifecycleEvent(Event.ON_DESTROY)
            startStop.removeObserver(this)
            destroy.removeObserver(this)
        }
    }

    override fun getLifecycle() = registry

    override fun addObserver(observer: LifecycleObserver) {
        registry.addObserver(observer)
    }

    override fun removeObserver(observer: LifecycleObserver) {
        registry.removeObserver(observer)
    }

    override fun getCurrentState(): State {
        return registry.currentState
    }
}