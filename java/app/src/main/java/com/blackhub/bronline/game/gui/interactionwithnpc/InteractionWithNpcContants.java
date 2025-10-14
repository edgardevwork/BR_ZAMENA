package com.blackhub.bronline.game.gui.interactionwithnpc;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: InteractionWithNpcDictionary.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class InteractionWithNpcContants {
    public static final int INTERACTION_WITH_NPC_BUTTON_GRAY = 2;
    public static final int INTERACTION_WITH_NPC_BUTTON_GREEN = 1;
    public static final int INTERACTION_WITH_NPC_BUTTON_RED = 3;
    public static final int INTERACTION_WITH_NPC_BUTTON_SKIP = 0;
    public static final float INTERACTION_WITH_NPC_RENDER_DEGREE_Y = 180.0f;

    @NotNull
    public static final InteractionWithNpcContants INSTANCE = new InteractionWithNpcContants();

    @NotNull
    public static final List<Character> symbolsWithDoubleDelay = CollectionsKt__CollectionsKt.listOf((Object[]) new Character[]{'.', ',', ';', ':'});
    public static final int $stable = 8;

    @NotNull
    public final List<Character> getSymbolsWithDoubleDelay() {
        return symbolsWithDoubleDelay;
    }
}

