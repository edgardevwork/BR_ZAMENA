package com.blackhub.bronline.game.gui.donate.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.DonatePackPreviewItemNewBinding;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DonatePreviewPackAdapter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DonatePreviewPackAdapter extends RecyclerView.Adapter<DonatePreviewPackViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public final List<String> list;

    public DonatePreviewPackAdapter(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
    }

    /* compiled from: DonatePreviewPackAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/donate/adapters/DonatePreviewPackAdapter$DonatePreviewPackViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/DonatePackPreviewItemNewBinding;", "(Lcom/blackhub/bronline/game/gui/donate/adapters/DonatePreviewPackAdapter;Lcom/blackhub/bronline/databinding/DonatePackPreviewItemNewBinding;)V", "getBinding", "()Lcom/blackhub/bronline/databinding/DonatePackPreviewItemNewBinding;", "bind", "", "item", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class DonatePreviewPackViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final DonatePackPreviewItemNewBinding binding;
        public final /* synthetic */ DonatePreviewPackAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DonatePreviewPackViewHolder(@NotNull DonatePreviewPackAdapter donatePreviewPackAdapter, DonatePackPreviewItemNewBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = donatePreviewPackAdapter;
            this.binding = binding;
        }

        @NotNull
        public final DonatePackPreviewItemNewBinding getBinding() {
            return this.binding;
        }

        public final void bind(@Nullable String item) {
            if (item != null) {
                this.binding.textView.setText(item);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DonatePreviewPackViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        DonatePackPreviewItemNewBinding donatePackPreviewItemNewBindingInflate = DonatePackPreviewItemNewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(donatePackPreviewItemNewBindingInflate, "inflate(...)");
        return new DonatePreviewPackViewHolder(this, donatePackPreviewItemNewBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull DonatePreviewPackViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.list.get(position));
    }
}

