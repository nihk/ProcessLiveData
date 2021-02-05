package ca.cbc.processlivedata

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.createGraph
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.fragment
import ca.cbc.processlivedata.databinding.MainFragmentBinding

class MainActivity : AppCompatActivity(R.layout.main_activity) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        createNavGraph()
    }

    private fun createNavGraph() {
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.navHostContainer) as NavHostFragment

        navHostFragment.navController.apply {
            graph = createGraph(
                id = AppNavGraph.id,
                startDestination = AppNavGraph.Destination.main
            ) {
                fragment<MainFragment>(AppNavGraph.Destination.main)
                fragment<PlayerFragment>(AppNavGraph.Destination.player)
            }
        }
    }
}

class MainFragment : Fragment(R.layout.main_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = MainFragmentBinding.bind(view)
        binding.goToPlayer.setOnClickListener {
            findNavController().navigate(AppNavGraph.Destination.player)
        }
    }
}

object AppNavGraph {
    const val id = 1

    object Destination {
        const val main = 2
        const val player = 3
    }
}