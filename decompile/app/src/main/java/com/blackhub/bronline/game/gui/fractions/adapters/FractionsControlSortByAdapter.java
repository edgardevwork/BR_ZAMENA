package com.blackhub.bronline.game.gui.fractions.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FractionsControlSortByItemBinding;
import com.blackhub.bronline.game.gui.fractions.adapters.FractionsControlSortByAdapter;
import com.blackhub.bronline.game.gui.fractions.data.FractionsSortByItem;
import com.bless.client.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FractionsControlSortByAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001eB\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u0007H\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\u001c\u0010\u0018\u001a\u00020\u000e2\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\u0007H\u0016J\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R5\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsControlSortByAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsControlSortByAdapter$FractionsControlSortByViewHolder;", IFramePlayerOptions.Builder.LIST, "", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsSortByItem;", "selectedItemPosition", "", "(Ljava/util/List;I)V", "onSortByItemClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "position", "", "getOnSortByItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnSortByItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "changeBackgroundColor", "binding", "Lcom/blackhub/bronline/databinding/FractionsControlSortByItemBinding;", "changeBackgroundColorClicked", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "FractionsControlSortByViewHolder", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class FractionsControlSortByAdapter extends RecyclerView.Adapter<FractionsControlSortByViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public final List<FractionsSortByItem> list;
    public Function1<? super Integer, Unit> onSortByItemClickListener;
    public int selectedItemPosition;

    public FractionsControlSortByAdapter(@NotNull List<FractionsSortByItem> list, int i) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
        this.selectedItemPosition = i;
    }

    @NotNull
    public final Function1<Integer, Unit> getOnSortByItemClickListener() {
        Function1 function1 = this.onSortByItemClickListener;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onSortByItemClickListener");
        return null;
    }

    public final void setOnSortByItemClickListener(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onSortByItemClickListener = function1;
    }

    /* compiled from: FractionsControlSortByAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsControlSortByAdapter$FractionsControlSortByViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/FractionsControlSortByItemBinding;", "(Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsControlSortByAdapter;Lcom/blackhub/bronline/databinding/FractionsControlSortByItemBinding;)V", "getBinding", "()Lcom/blackhub/bronline/databinding/FractionsControlSortByItemBinding;", "bind", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class FractionsControlSortByViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final FractionsControlSortByItemBinding binding;
        public final /* synthetic */ FractionsControlSortByAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FractionsControlSortByViewHolder(@NotNull FractionsControlSortByAdapter fractionsControlSortByAdapter, FractionsControlSortByItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = fractionsControlSortByAdapter;
            this.binding = binding;
        }

        @NotNull
        public final FractionsControlSortByItemBinding getBinding() {
            return this.binding;
        }

        public final void bind() {
            FractionsControlSortByItemBinding fractionsControlSortByItemBinding = this.binding;
            final FractionsControlSortByAdapter fractionsControlSortByAdapter = this.this$0;
            fractionsControlSortByItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fractions.adapters.FractionsControlSortByAdapter$FractionsControlSortByViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FractionsControlSortByAdapter.FractionsControlSortByViewHolder.bind$lambda$1$lambda$0(fractionsControlSortByAdapter, this, view);
                }
            });
            if (fractionsControlSortByAdapter.selectedItemPosition == getAdapterPosition()) {
                fractionsControlSortByAdapter.changeBackgroundColorClicked(this.binding, getAdapterPosition());
            } else {
                fractionsControlSortByAdapter.changeBackgroundColor(this.binding, getAdapterPosition());
            }
            fractionsControlSortByItemBinding.textViewTitle.setText(((FractionsSortByItem) fractionsControlSortByAdapter.list.get(getAdapterPosition())).getTitle());
        }

        public static final void bind$lambda$1$lambda$0(FractionsControlSortByAdapter this$0, FractionsControlSortByViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (this$0.selectedItemPosition != this$1.getAdapterPosition()) {
                this$0.notifyItemChanged(this$0.selectedItemPosition);
                this$0.selectedItemPosition = this$1.getAdapterPosition();
                this$0.notifyItemChanged(this$0.selectedItemPosition);
                this$0.getOnSortByItemClickListener().invoke(Integer.valueOf(this$1.getAdapterPosition()));
            }
        }
    }

    public final void changeBackgroundColor(FractionsControlSortByItemBinding binding, int position) {
        if (position == 3) {
            binding.getRoot().setBackground(ContextCompat.getDrawable(binding.getRoot().getContext(), R.drawable.bg_rectangle_gray_crb5_1));
            return;
        }
        for (int i = 0; i < 3; i++) {
            binding.getRoot().setBackgroundColor(ContextCompat.getColor(binding.getRoot().getContext(), R.color.dark_gray));
        }
    }

    public final void changeBackgroundColorClicked(FractionsControlSortByItemBinding binding, int position) {
        if (position == 3) {
            binding.getRoot().setBackground(ContextCompat.getDrawable(binding.getRoot().getContext(), R.drawable.bg_rectangle_blue_crb5));
            return;
        }
        for (int i = 0; i < 3; i++) {
            binding.getRoot().setBackgroundColor(ContextCompat.getColor(binding.getRoot().getContext(), R.color.dark_gray_blue));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FractionsControlSortByViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FractionsControlSortByItemBinding fractionsControlSortByItemBindingInflate = FractionsControlSortByItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(fractionsControlSortByItemBindingInflate, "inflate(...)");
        return new FractionsControlSortByViewHolder(this, fractionsControlSortByItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FractionsControlSortByViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }
}
