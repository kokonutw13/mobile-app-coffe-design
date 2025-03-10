package com.castaneda.coffemobileapp.utils

object ROUTES {
    const val HOME = "home"
    const val DETAIL = "detail/{productId}"
    const val DELIVERY = "delivery"
    const val ORDER = "order"
    const val ONBOARDING = "onboarding"

    fun createDetailRoute(productId: Int): String {
        return "detail/$productId"
    }
}