package com.example.secondproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.secondproject.databinding.FragmentProfileBinding


class ProfileFragment : Fragment(R.layout.fragment_profile){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)
//        binding?.run{
  //          buttonToTL.setOnClickListener {
    //            var bundle = Bundle()
      //          bundle.putString("TL_NAME", "Profile")
        //        findNavController().navigate(R.id.action_profileFragment_to_newTLFragment,
          //      bundle
            //    )
            //}
        //}
    }
    companion object{
        private var binding: FragmentProfileBinding? = null
            fun createBundle():Bundle{
                var bundle = Bundle()
                bundle.putString("TL_NAME", "Profile")
                return bundle
            }

    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}