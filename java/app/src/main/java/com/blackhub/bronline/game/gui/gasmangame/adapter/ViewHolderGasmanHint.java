package com.blackhub.bronline.game.gui.gasmangame.adapter;

import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.ItemGasmanViewPagerHintBinding;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.gui.gasmangame.entitie.GasmanAdapterHintItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewHolderGasmanHint.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ViewHolderGasmanHint extends RecyclerView.ViewHolder {
    public static final int $stable = 8;

    @NotNull
    public final ItemGasmanViewPagerHintBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewHolderGasmanHint(@NotNull ItemGasmanViewPagerHintBinding binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    public final void bind(@NotNull GasmanAdapterHintItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ItemGasmanViewPagerHintBinding itemGasmanViewPagerHintBinding = this.binding;
        itemGasmanViewPagerHintBinding.f382tv.setText(item.getText());
        ImageView ivExample = itemGasmanViewPagerHintBinding.ivExample;
        Intrinsics.checkNotNullExpressionValue(ivExample, "ivExample");
        ViewExtensionKt.loadImage$default(ivExample, item.getDrawable(), 0, null, 6, null);
    }
}

