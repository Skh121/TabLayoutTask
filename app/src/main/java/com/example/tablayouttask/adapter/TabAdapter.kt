package com.example.tablayouttask.adapter

import android.graphics.pdf.PdfDocument.Page
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tablayouttask.fragment.ChatFragment
import com.example.tablayouttask.fragment.MessageFragment
import com.example.tablayouttask.fragment.PageNotFoundFragment
import com.example.tablayouttask.fragment.PostFragment

class TabAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> ChatFragment()
            1 -> PostFragment()
            2 -> MessageFragment()
            else -> PageNotFoundFragment()
        }
    }

    override fun getItemCount(): Int {
       return 3;
    }
}