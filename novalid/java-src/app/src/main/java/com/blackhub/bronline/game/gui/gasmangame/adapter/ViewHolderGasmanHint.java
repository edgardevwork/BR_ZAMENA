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
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/gasmangame/adapter/ViewHolderGasmanHint;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/ItemGasmanViewPagerHintBinding;", "(Lcom/blackhub/bronline/databinding/ItemGasmanViewPagerHintBinding;)V", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/gasmangame/entitie/GasmanAdapterHintItem;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
