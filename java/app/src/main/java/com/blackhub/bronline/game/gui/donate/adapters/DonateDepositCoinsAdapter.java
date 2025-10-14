package com.blackhub.bronline.game.gui.donate.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.DonateCoinsHotItemBinding;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DonateDepositCoinsAdapter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DonateDepositCoinsAdapter extends RecyclerView.Adapter<DonateDepositCoinsAdapterViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public final List<String> list;

    @NotNull
    public final List<String> getList() {
        return this.list;
    }

    public DonateDepositCoinsAdapter(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
    }

    /* compiled from: DonateDepositCoinsAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/donate/adapters/DonateDepositCoinsAdapter$DonateDepositCoinsAdapterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/DonateCoinsHotItemBinding;", "(Lcom/blackhub/bronline/game/gui/donate/adapters/DonateDepositCoinsAdapter;Lcom/blackhub/bronline/databinding/DonateCoinsHotItemBinding;)V", "getBinding", "()Lcom/blackhub/bronline/databinding/DonateCoinsHotItemBinding;", "bind", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class DonateDepositCoinsAdapterViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final DonateCoinsHotItemBinding binding;
        public final /* synthetic */ DonateDepositCoinsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DonateDepositCoinsAdapterViewHolder(@NotNull DonateDepositCoinsAdapter donateDepositCoinsAdapter, DonateCoinsHotItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = donateDepositCoinsAdapter;
            this.binding = binding;
        }

        @NotNull
        public final DonateCoinsHotItemBinding getBinding() {
            return this.binding;
        }

        public final void bind() {
            this.binding.text.setText(UsefulKt.transformColors(this.this$0.getList().get(getLayoutPosition())));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DonateDepositCoinsAdapterViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        DonateCoinsHotItemBinding donateCoinsHotItemBindingInflate = DonateCoinsHotItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(donateCoinsHotItemBindingInflate, "inflate(...)");
        return new DonateDepositCoinsAdapterViewHolder(this, donateCoinsHotItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull DonateDepositCoinsAdapterViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind();
    }
}

