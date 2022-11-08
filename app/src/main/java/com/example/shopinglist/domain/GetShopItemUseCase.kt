package com.example.shopinglist.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun GetShopItem(shopItemId: Int): ShopItem{
        return shopListRepository.getShopItem(shopItemId)
    }
}