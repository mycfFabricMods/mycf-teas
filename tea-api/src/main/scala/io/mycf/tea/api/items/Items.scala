package io.mycf.tea.api.items

import io.mycf.tea.api.ScalaUtils.MOD_ID
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

import scala.collection.mutable
import scala.util.matching.Regex

object Items:
  private val itemRegistry: mutable.LinkedHashMap[String, Item] = mutable.LinkedHashMap()

  /**
   * Register [[net.minecraft.item.Item]]'s in here.
   */
  val COOL_ITEM: Item = addItem("cool_item", Item(Item.Settings().maxCount(64).group(ItemGroup.MISC)))

  private def addItem(name: String, item: Item): Item = {
    itemRegistry.put(name.trim().toLowerCase(), item)
    item
  }

  def registerItems(): Unit = {
    for {
      (name, item) <- itemRegistry
    } yield Registry.register(Registry.ITEM, Identifier(MOD_ID, name), item)
  }

end Items

