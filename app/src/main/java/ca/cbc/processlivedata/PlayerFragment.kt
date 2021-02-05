package ca.cbc.processlivedata

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ProcessLifecycleOwner
import androidx.lifecycle.ViewModelProvider
import ca.cbc.processlivedata.databinding.PlayerFragmentBinding
import com.google.android.exoplayer2.Player

class PlayerFragment : Fragment(R.layout.player_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = PlayerFragmentBinding.bind(view)
        val viewModelFactory = PlayerViewModel.Factory(
            requireContext().applicationContext,
            ProcessLifecycleOwner.get().lifecycle
        )
        val viewModel = ViewModelProvider(this, viewModelFactory)
            .get(PlayerViewModel::class.java)
        viewModel.player.observe(viewLifecycleOwner) { player: Player? ->
            binding.playerView.player = player
        }
    }
}