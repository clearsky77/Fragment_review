package com.clearsky77.fragment_review.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.clearsky77.fragment_review.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() { //상속을 받아야 편하다. androidx로 임포트
    override fun onCreateView(
        inflater: LayoutInflater, // xml을 끌어올 수 있다.
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) { // 화면이 완성되면 실행되는 함수. c.f.onCreat함수.)
        super.onActivityCreated(savedInstanceState)

        logBtn.setOnClickListener {
            Log.d("첫 프래그먼트", "버튼 눌림")
        }
    }
}