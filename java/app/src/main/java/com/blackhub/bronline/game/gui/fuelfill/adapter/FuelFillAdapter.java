package com.blackhub.bronline.game.gui.fuelfill.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FuelFillItemBinding;
import com.blackhub.bronline.game.gui.fuelfill.adapter.FuelFillAdapter;
import com.blackhub.bronline.game.gui.fuelfill.data.TypeAndPriceOfFuel;
import com.bless.client.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FuelFillAdapter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class FuelFillAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: anim$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy anim;

    @NotNull
    public final Context context;
    public Function2<? super Integer, ? super Integer, Unit> fuelClickListener;

    @NotNull
    public List<TypeAndPriceOfFuel> fuelList;
    public int selectedPos;

    public FuelFillAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.fuelList = CollectionsKt__CollectionsKt.emptyList();
        this.anim = LazyKt__LazyJVMKt.lazy(new Function0<Animation>() { // from class: com.blackhub.bronline.game.gui.fuelfill.adapter.FuelFillAdapter$anim$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Animation invoke() {
                return AnimationUtils.loadAnimation(this.this$0.context, R.anim.button_click);
            }
        });
    }

    public final Animation getAnim() {
        return (Animation) this.anim.getValue();
    }

    @NotNull
    public final Function2<Integer, Integer, Unit> getFuelClickListener() {
        Function2 function2 = this.fuelClickListener;
        if (function2 != null) {
            return function2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fuelClickListener");
        return null;
    }

    public final void setFuelClickListener(@NotNull Function2<? super Integer, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.fuelClickListener = function2;
    }

    public final void initFuelList(@NotNull List<TypeAndPriceOfFuel> fuelList) {
        Intrinsics.checkNotNullParameter(fuelList, "fuelList");
        this.fuelList = fuelList;
        notifyDataSetChanged();
    }

    /* compiled from: FuelFillAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fuelfill/adapter/FuelFillAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/FuelFillItemBinding;", "(Lcom/blackhub/bronline/game/gui/fuelfill/adapter/FuelFillAdapter;Lcom/blackhub/bronline/databinding/FuelFillItemBinding;)V", "bind", "", "fuelItem", "Lcom/blackhub/bronline/game/gui/fuelfill/data/TypeAndPriceOfFuel;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final FuelFillItemBinding binding;
        public final /* synthetic */ FuelFillAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull FuelFillAdapter fuelFillAdapter, FuelFillItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = fuelFillAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull final TypeAndPriceOfFuel fuelItem) {
            Intrinsics.checkNotNullParameter(fuelItem, "fuelItem");
            FuelFillItemBinding fuelFillItemBinding = this.binding;
            final FuelFillAdapter fuelFillAdapter = this.this$0;
            fuelFillItemBinding.ffiTypeOfFuel.setText(fuelItem.getType());
            fuelFillItemBinding.ffiPriceOfFuel.setText(fuelFillAdapter.context.getString(R.string.fuel_fill_price_of_fuel, Integer.valueOf(fuelItem.getPrice())));
            if (fuelItem.getSelected()) {
                fuelFillItemBinding.getRoot().setBackground(ResourcesCompat.getDrawable(fuelFillAdapter.context.getResources(), R.drawable.bg_fuell_fill_unselect_item, null));
            } else {
                fuelFillItemBinding.getRoot().setBackground(ResourcesCompat.getDrawable(fuelFillAdapter.context.getResources(), R.drawable.bg_rectangle_total_black90_cr10, null));
            }
            fuelFillItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fuelfill.adapter.FuelFillAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FuelFillAdapter.ViewHolder.bind$lambda$1$lambda$0(fuelFillAdapter, this, fuelItem, view);
                }
            });
        }

        public static final void bind$lambda$1$lambda$0(FuelFillAdapter this$0, ViewHolder this$1, TypeAndPriceOfFuel fuelItem, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(fuelItem, "$fuelItem");
            view.startAnimation(this$0.getAnim());
            this$0.getFuelClickListener().invoke(Integer.valueOf(this$1.getBindingAdapterPosition()), Integer.valueOf(fuelItem.getPrice()));
            this$0.updateFuelView(this$1.getBindingAdapterPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FuelFillItemBinding fuelFillItemBindingInflate = FuelFillItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(fuelFillItemBindingInflate, "inflate(...)");
        return new ViewHolder(this, fuelFillItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSizeInv() {
        return this.fuelList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.fuelList.get(position));
    }

    public final void updateFuelView(int fuelPos) {
        int i;
        if (this.selectedPos >= this.fuelList.size() || fuelPos >= this.fuelList.size() || (i = this.selectedPos) == fuelPos) {
            return;
        }
        this.fuelList.get(i).setSelected(false);
        this.fuelList.get(fuelPos).setSelected(true);
        notifyItemChanged(this.selectedPos);
        notifyItemChanged(fuelPos);
        this.selectedPos = fuelPos;
    }
}

