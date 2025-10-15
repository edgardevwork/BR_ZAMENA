package com.blackhub.bronline.game.gui.interactionwithnpc;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: InteractionWithNpcDictionary.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0010\f\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcContants;", "", "()V", "INTERACTION_WITH_NPC_BUTTON_GRAY", "", "INTERACTION_WITH_NPC_BUTTON_GREEN", "INTERACTION_WITH_NPC_BUTTON_RED", "INTERACTION_WITH_NPC_BUTTON_SKIP", "INTERACTION_WITH_NPC_RENDER_DEGREE_Y", "", "symbolsWithDoubleDelay", "", "", "getSymbolsWithDoubleDelay", "()Ljava/util/List;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
