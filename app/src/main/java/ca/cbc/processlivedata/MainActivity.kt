package ca.cbc.processlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(), MainFragment.Listener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            navigateToFragment { MainFragment.create() }
        }
    }

    override fun onNavigateToPlayer() {
        navigateToFragment(true) { PlayerFragment.create() }
    }

    private fun navigateToFragment(withBackStack: Boolean = false, producer: () -> Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, producer())
            .apply { if (withBackStack) addToBackStack(null) }
            .commit()
    }
}
