package com.blackhub.bronline.game.gui.dialog.gameinstruction;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.ItemViewPagerGameInstructionsBinding;
import com.blackhub.bronline.game.gui.Useful;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewHolderGameInstructions.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/ViewHolderGameInstructions;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/ItemViewPagerGameInstructionsBinding;", "(Lcom/blackhub/bronline/databinding/ItemViewPagerGameInstructionsBinding;)V", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsItem;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class ViewHolderGameInstructions extends RecyclerView.ViewHolder {
    public static final int $stable = 8;

    @NotNull
    public final ItemViewPagerGameInstructionsBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewHolderGameInstructions(@NotNull ItemViewPagerGameInstructionsBinding binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    public final void bind(@NotNull GameInstructionsItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ItemViewPagerGameInstructionsBinding itemViewPagerGameInstructionsBinding = this.binding;
        itemViewPagerGameInstructionsBinding.f383tv.setText(Useful.INSTANCE.getTextWithHtmlStyles(item.getText()));
        itemViewPagerGameInstructionsBinding.ivExample.setImageResource(item.getDrawable());
    }
}
