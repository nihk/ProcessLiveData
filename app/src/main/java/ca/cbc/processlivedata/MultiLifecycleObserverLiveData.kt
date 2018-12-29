package ca.cbc.processlivedata

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData

abstract class MultiLifecycleObserverLiveData<T>(
    private val startStop: Lifecycle,
    private val destroy: Lifecycle
) : LiveData<T>(), DefaultLifecycleObserver {

    abstract fun createResource(): T
    abstract fun tearDownResource()

    override fun onActive() {
        startStop.addObserver(this)
        destroy.addObserver(this)
    }

    override fun onStart(owner: LifecycleOwner) {
        if (owner.lifecycle != startStop) {
            return
        }

        value = createResource()
    }

    override fun onStop(owner: LifecycleOwner) {
        if (owner.lifecycle != startStop) {
            return
        }

        tearDownResource()
    }

    override fun onDestroy(owner: LifecycleOwner) {
        if (owner.lifecycle != destroy) {
            return
        }

        startStop.removeObserver(this)
        destroy.removeObserver(this)
        tearDownResource()
    }
}