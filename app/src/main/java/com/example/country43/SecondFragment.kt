package com.example.country43

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.country43.databinding.FragmentSecondBinding

class SecondFragment : Fragment(), onClick {

    private lateinit var binding: FragmentSecondBinding
    private val data = ArrayList<Model>()
    private lateinit var adapter: MainAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        initAdapter()
    }

    private fun loadData() {
        val bundle: Bundle? = arguments
        val bund = bundle?.getInt("key")
        when (bund) {
            1 -> {
                data.add(Model("Сanada", R.drawable.au, 1))
                data.add(Model("Сanada", R.drawable.au, 1))
                data.add(Model("Сanada", R.drawable.au, 1))
                data.add(Model("Сanada", R.drawable.au, 1))
                data.add(Model("Сanada", R.drawable.au, 1))
            }
            2 -> {
                data.add(Model("Сanada", R.drawable.au, 2))
                data.add(Model("Сanada", R.drawable.au, 2))
                data.add(Model("Сanada", R.drawable.au, 2))
                data.add(Model("Сanada", R.drawable.au, 2))
                data.add(Model("Сanada", R.drawable.au, 2))
            }3 -> {
                data.add(Model("Сanada", R.drawable.au, 3))
                data.add(Model("Сanada", R.drawable.au, 3))
                data.add(Model("Сanada", R.drawable.au, 3))
                data.add(Model("Сanada", R.drawable.au, 3))
                data.add(Model("Сanada", R.drawable.au, 3))
            }4 -> {
                data.add(Model("Сanada", R.drawable.au, 4))
                data.add(Model("Сanada", R.drawable.au, 4))
                data.add(Model("Сanada", R.drawable.au, 4))
                data.add(Model("Сanada", R.drawable.au, 4))
                data.add(Model("Сanada", R.drawable.au, 4))
            }5 -> {
                data.add(Model("Сanada", R.drawable.au, 5))
                data.add(Model("Сanada", R.drawable.au, 5))
                data.add(Model("Сanada", R.drawable.au, 5))
                data.add(Model("Сanada", R.drawable.au, 5))
                data.add(Model("Сanada", R.drawable.au, 5))
            }

        }
    }

    private fun initAdapter() {
        adapter = MainAdapter(data, this::onClick)
        binding.recyclerView.adapter = adapter
    }

    override fun onClick(keyId: Int) {

    }
}