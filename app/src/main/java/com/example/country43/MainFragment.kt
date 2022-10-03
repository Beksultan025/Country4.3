package com.example.country43

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.country43.databinding.FragmentMainBinding

class MainFragment : Fragment() , onClick{

    private lateinit var binding: FragmentMainBinding
    private val data = ArrayList<Model>()
    private lateinit var adapter: MainAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater , container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        loadData()
        initAdapter()
    }

    private fun loadData() {
        data.add(Model("South Amerika", R.drawable.au, 1));
        data.add(Model("Nourth Amerika", R.drawable.au, 2));
        data.add(Model("Australia", R.drawable.au, 3));
        data.add(Model("Africa", R.drawable.au,4));
        data.add(Model("Asia", R.drawable.au,5));
        data.add(Model("Europa", R.drawable.au,6));
    }

    private fun initAdapter() {
        adapter = MainAdapter(data , this::onClick)
        binding.recycler.adapter = adapter
    }

    override fun onClick(keyId: Int) {
        val bundle = Bundle()
        bundle.putInt("key" , keyId)
        val fragment = SecondFragment()
        fragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction().
                replace(R.id.container , fragment).addToBackStack(null).commit()
    }


}