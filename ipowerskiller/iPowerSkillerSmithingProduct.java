package net.runelite.client.plugins.ipowerskiller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;

@AllArgsConstructor
public enum iPowerSkillerSmithingProduct {

    NONE(null, -1),
    DAGGER(WidgetInfo.SMITHING_ANVIL_DAGGER, 1),
    SWORD(WidgetInfo.SMITHING_ANVIL_SWORD, 1),
    SCIMITAR(WidgetInfo.SMITHING_ANVIL_SCIMITAR, 2),
    LONGSWORD(WidgetInfo.SMITHING_ANVIL_LONG_SWORD, 2),
    TWO_HANDED_SWORD(WidgetInfo.SMITHING_ANVIL_TWO_H_SWORD, 2),
    AXE(WidgetInfo.SMITHING_ANVIL_AXE, 1),
    MACE(WidgetInfo.SMITHING_ANVIL_MACE, 1),
    WARHAMMER(WidgetInfo.SMITHING_ANVIL_WARHAMMER, 3),
    BATTLE_AXE(WidgetInfo.SMITHING_ANVIL_BATTLE_AXE, 3),
    CHAINBODY(WidgetInfo.SMITHING_ANVIL_CHAIN_BODY, 3),
    PLATELEGS(WidgetInfo.SMITHING_ANVIL_PLATE_LEGS, 3),
    PLATESKIRT(WidgetInfo.SMITHING_ANVIL_PLATE_SKIRT, 3),
    PLATEBODY(WidgetInfo.SMITHING_ANVIL_PLATE_BODY, 5),
    NAILS(WidgetInfo.SMITHING_ANVIL_NAILS, 1),
    MEDIUM_HELM(WidgetInfo.SMITHING_ANVIL_MED_HELM, 1),
    FULL_HELM(WidgetInfo.SMITHING_ANVIL_FULL_HELM, 2),
    SQUARE_SHIELD(WidgetInfo.SMITHING_ANVIL_SQ_SHIELD, 2),
    KITESHIELD(WidgetInfo.SMITHING_ANVIL_KITE_SHIELD, 3),
    DART_TIPS(WidgetInfo.SMITHING_ANVIL_DART_TIPS, 1),
    ARROW_HEADS(WidgetInfo.SMITHING_ANVIL_ARROW_HEADS, 1),
    KNIVES(WidgetInfo.SMITHING_ANVIL_KNIVES, 1),
    BRONZE_WIRE(WidgetInfo.SMITHING_ANVIL_EXCLUSIVE1, 1),
    JAVELIN_HEADS(WidgetInfo.SMITHING_ANVIL_JAVELIN_HEADS, 1),
    BOLTS(WidgetInfo.SMITHING_ANVIL_BOLTS, 1),
    LIMBS(WidgetInfo.SMITHING_ANVIL_LIMBS, 1);

    @Getter
    private final WidgetInfo widget;
    @Getter
    private final int barsRequired;

}
