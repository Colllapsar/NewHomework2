package ru.netology.hiearchy.view

open class ViewGroup : View() {
    private var view: View? = null

    open fun addView(view: TextView) {
        this.view = view
    }}
