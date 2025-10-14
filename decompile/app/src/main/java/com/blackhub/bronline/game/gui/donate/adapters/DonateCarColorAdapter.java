package com.blackhub.bronline.game.gui.donate.adapters;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.DonateCarPreviewItemBinding;
import com.blackhub.bronline.game.gui.donate.adapters.DonateCarColorAdapter;
import com.blackhub.bronline.game.gui.donate.data.CarColorItem;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DonateCarColorAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\rH\u0016J\u001c\u0010\u001f\u001a\u00020\u00122\n\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\rH\u0016J\u001c\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\rH\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nRJ\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0010\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001b¨\u0006'"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/donate/adapters/DonateCarColorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/donate/adapters/DonateCarColorAdapter$DonateCarColorAdapterNewViewHolder;", "()V", "carColors", "", "Lcom/blackhub/bronline/game/gui/donate/data/CarColorItem;", "getCarColors", "()Ljava/util/List;", "setCarColors", "(Ljava/util/List;)V", "onColorClickListener", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "selected", "gameColor", "", "getOnColorClickListener", "()Lkotlin/jvm/functions/Function2;", "setOnColorClickListener", "(Lkotlin/jvm/functions/Function2;)V", "priceForColour", "getPriceForColour", "()I", "setPriceForColour", "(I)V", "getSelected", "setSelected", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DonateCarColorAdapterNewViewHolder", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class DonateCarColorAdapter extends RecyclerView.Adapter<DonateCarColorAdapterNewViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public List<CarColorItem> carColors = CollectionsKt__CollectionsKt.emptyList();
    public Function2<? super Integer, ? super Integer, Unit> onColorClickListener;
    public int priceForColour;
    public int selected;

    @NotNull
    public final List<CarColorItem> getCarColors() {
        return this.carColors;
    }

    public final void setCarColors(@NotNull List<CarColorItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.carColors = list;
    }

    public final int getPriceForColour() {
        return this.priceForColour;
    }

    public final void setPriceForColour(int i) {
        this.priceForColour = i;
    }

    public final int getSelected() {
        return this.selected;
    }

    public final void setSelected(int i) {
        this.selected = i;
    }

    @NotNull
    public final Function2<Integer, Integer, Unit> getOnColorClickListener() {
        Function2 function2 = this.onColorClickListener;
        if (function2 != null) {
            return function2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onColorClickListener");
        return null;
    }

    public final void setOnColorClickListener(@NotNull Function2<? super Integer, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.onColorClickListener = function2;
    }

    /* compiled from: DonateCarColorAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/donate/adapters/DonateCarColorAdapter$DonateCarColorAdapterNewViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/DonateCarPreviewItemBinding;", "(Lcom/blackhub/bronline/game/gui/donate/adapters/DonateCarColorAdapter;Lcom/blackhub/bronline/databinding/DonateCarPreviewItemBinding;)V", "getBinding", "()Lcom/blackhub/bronline/databinding/DonateCarPreviewItemBinding;", "bind", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class DonateCarColorAdapterNewViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final DonateCarPreviewItemBinding binding;
        public final /* synthetic */ DonateCarColorAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DonateCarColorAdapterNewViewHolder(@NotNull DonateCarColorAdapter donateCarColorAdapter, DonateCarPreviewItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = donateCarColorAdapter;
            this.binding = binding;
        }

        @NotNull
        public final DonateCarPreviewItemBinding getBinding() {
            return this.binding;
        }

        public final void bind() {
            DonateCarPreviewItemBinding donateCarPreviewItemBinding = this.binding;
            final DonateCarColorAdapter donateCarColorAdapter = this.this$0;
            if (donateCarColorAdapter.getCarColors().get(getLayoutPosition()).getSelected()) {
                if (getLayoutPosition() == 0) {
                    this.binding.free.setVisibility(0);
                } else {
                    this.binding.free.setVisibility(4);
                    this.binding.paid.setVisibility(0);
                }
                DonateCarPreviewItemBinding donateCarPreviewItemBinding2 = this.binding;
                donateCarPreviewItemBinding2.border.setBackground(ResourcesCompat.getDrawable(donateCarPreviewItemBinding2.getRoot().getContext().getResources(), R.drawable.bg_border_active_button, null));
            } else {
                donateCarPreviewItemBinding.paid.setVisibility(4);
                donateCarPreviewItemBinding.free.setVisibility(4);
                donateCarPreviewItemBinding.border.setBackground(ResourcesCompat.getDrawable(donateCarPreviewItemBinding.getRoot().getContext().getResources(), R.drawable.bg_border_inactive_button, null));
            }
            donateCarPreviewItemBinding.paid.setText(donateCarPreviewItemBinding.getRoot().getContext().getString(R.string.donate_colour_price, Integer.valueOf(donateCarColorAdapter.getPriceForColour())));
            donateCarPreviewItemBinding.color.setBackgroundColor(Color.parseColor(donateCarColorAdapter.getCarColors().get(getLayoutPosition()).getColor()));
            donateCarPreviewItemBinding.border.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.donate.adapters.DonateCarColorAdapter$DonateCarColorAdapterNewViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DonateCarColorAdapter.DonateCarColorAdapterNewViewHolder.bind$lambda$1$lambda$0(donateCarColorAdapter, this, view);
                }
            });
        }

        public static final void bind$lambda$1$lambda$0(DonateCarColorAdapter this$0, DonateCarColorAdapterNewViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.getCarColors().get(this$0.getSelected()).setSelected(false);
            this$0.notifyItemChanged(this$0.getSelected());
            this$0.getCarColors().get(this$1.getLayoutPosition()).setSelected(true);
            this$0.setSelected(this$1.getLayoutPosition());
            this$0.notifyItemChanged(this$1.getLayoutPosition());
            this$0.getOnColorClickListener().invoke(Integer.valueOf(this$0.getSelected()), Integer.valueOf(this$0.getCarColors().get(this$1.getLayoutPosition()).getGameColor()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DonateCarColorAdapterNewViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        DonateCarPreviewItemBinding donateCarPreviewItemBindingInflate = DonateCarPreviewItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(donateCarPreviewItemBindingInflate, "inflate(...)");
        return new DonateCarColorAdapterNewViewHolder(this, donateCarPreviewItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.carColors.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull DonateCarColorAdapterNewViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind();
    }
}
