package com.example.shopinglist.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun addShopItemCase(shopItem: ShopItem){
        shopListRepository.addShopItemCase(shopItem)
    }
}