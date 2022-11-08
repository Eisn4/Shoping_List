package com.example.shopinglist.domain

interface ShopListRepository {

    fun getShopList(): List<ShopItem>

    fun getShopItem(shopItemId: Int): ShopItem

    fun editShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun addShopItemCase(shopItem: ShopItem)
}