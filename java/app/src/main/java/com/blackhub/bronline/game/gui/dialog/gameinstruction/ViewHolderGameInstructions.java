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

