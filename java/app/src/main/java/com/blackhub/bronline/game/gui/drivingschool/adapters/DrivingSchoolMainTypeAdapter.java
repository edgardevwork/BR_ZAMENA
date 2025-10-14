package com.blackhub.bronline.game.gui.drivingschool.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.DrivingSchoolMainItemBinding;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.drivingschool.adapters.DrivingSchoolMainTypeAdapter;
import com.blackhub.bronline.game.gui.drivingschool.data.DrivingMainType;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DrivingSchoolMainTypeAdapter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DrivingSchoolMainTypeAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public final Context context;
    public final int invisible;
    public Function3<? super DrivingMainType, ? super Integer, ? super View, Unit> mainTypeSchoolClickListener;

    @NotNull
    public List<DrivingMainType> schoolsTypes;
    public final int visible;

    public DrivingSchoolMainTypeAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.invisible = 4;
        this.schoolsTypes = CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public final Function3<DrivingMainType, Integer, View, Unit> getMainTypeSchoolClickListener() {
        Function3 function3 = this.mainTypeSchoolClickListener;
        if (function3 != null) {
            return function3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainTypeSchoolClickListener");
        return null;
    }

    public final void setMainTypeSchoolClickListener(@NotNull Function3<? super DrivingMainType, ? super Integer, ? super View, Unit> function3) {
        Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.mainTypeSchoolClickListener = function3;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void initItems(@NotNull List<DrivingMainType> schoolsTypes) {
        Intrinsics.checkNotNullParameter(schoolsTypes, "schoolsTypes");
        this.schoolsTypes = schoolsTypes;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        DrivingSchoolMainItemBinding drivingSchoolMainItemBindingInflate = DrivingSchoolMainItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(drivingSchoolMainItemBindingInflate, "inflate(...)");
        return new ViewHolder(this, drivingSchoolMainItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.schoolsTypes.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.schoolsTypes.size();
    }

    /* compiled from: DrivingSchoolMainTypeAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/drivingschool/adapters/DrivingSchoolMainTypeAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/DrivingSchoolMainItemBinding;", "(Lcom/blackhub/bronline/game/gui/drivingschool/adapters/DrivingSchoolMainTypeAdapter;Lcom/blackhub/bronline/databinding/DrivingSchoolMainItemBinding;)V", "bind", "", "typeSchool", "Lcom/blackhub/bronline/game/gui/drivingschool/data/DrivingMainType;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final DrivingSchoolMainItemBinding binding;
        public final /* synthetic */ DrivingSchoolMainTypeAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull DrivingSchoolMainTypeAdapter drivingSchoolMainTypeAdapter, DrivingSchoolMainItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = drivingSchoolMainTypeAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull final DrivingMainType typeSchool) {
            Intrinsics.checkNotNullParameter(typeSchool, "typeSchool");
            DrivingSchoolMainItemBinding drivingSchoolMainItemBinding = this.binding;
            final DrivingSchoolMainTypeAdapter drivingSchoolMainTypeAdapter = this.this$0;
            drivingSchoolMainItemBinding.titleMainItem.setText(typeSchool.getName());
            drivingSchoolMainItemBinding.drivingSchoolValuePrice.setText(UsefulKt.getPriceWithSpaces(Integer.valueOf(typeSchool.getPrice())));
            drivingSchoolMainItemBinding.iconDrivingSchool.setImageResource(typeSchool.getImageId());
            int iIsUnBlock = typeSchool.isUnBlock();
            if (iIsUnBlock == 0) {
                drivingSchoolMainItemBinding.bgMaskDrivingSchool.setVisibility(drivingSchoolMainTypeAdapter.visible);
                drivingSchoolMainItemBinding.iconIfNoActiveDrivingSchool.setVisibility(drivingSchoolMainTypeAdapter.visible);
                drivingSchoolMainItemBinding.textIfNotActualDrivingSchool.setText(drivingSchoolMainTypeAdapter.context.getString(R.string.driving_school_main_item_description_1));
                drivingSchoolMainItemBinding.textIfNotActualDrivingSchool.setVisibility(drivingSchoolMainTypeAdapter.visible);
            } else if (iIsUnBlock == 1) {
                drivingSchoolMainItemBinding.bgMaskDrivingSchool.setVisibility(drivingSchoolMainTypeAdapter.invisible);
                drivingSchoolMainItemBinding.iconIfNoActiveDrivingSchool.setVisibility(drivingSchoolMainTypeAdapter.invisible);
                drivingSchoolMainItemBinding.textIfNotActualDrivingSchool.setVisibility(drivingSchoolMainTypeAdapter.invisible);
            } else if (iIsUnBlock == 2) {
                drivingSchoolMainItemBinding.bgMaskDrivingSchool.setVisibility(drivingSchoolMainTypeAdapter.visible);
                drivingSchoolMainItemBinding.iconIfNoActiveDrivingSchool.setVisibility(drivingSchoolMainTypeAdapter.visible);
                drivingSchoolMainItemBinding.textIfNotActualDrivingSchool.setText(drivingSchoolMainTypeAdapter.context.getString(R.string.driving_school_main_item_description_2));
                drivingSchoolMainItemBinding.textIfNotActualDrivingSchool.setVisibility(drivingSchoolMainTypeAdapter.visible);
            }
            if (!typeSchool.isCheck()) {
                drivingSchoolMainItemBinding.drivingSchoolBg.setBackground(ResourcesCompat.getDrawable(drivingSchoolMainTypeAdapter.context.getResources(), R.drawable.bg_circular_stripes_blue, null));
                drivingSchoolMainItemBinding.drivingSchoolMainItem.setBackground(ResourcesCompat.getDrawable(drivingSchoolMainTypeAdapter.context.getResources(), R.drawable.bg_rectangle_transparent_cr8_t10_gray, null));
                drivingSchoolMainItemBinding.bgPrice.setVisibility(4);
            } else {
                drivingSchoolMainItemBinding.drivingSchoolBg.setBackground(ResourcesCompat.getDrawable(drivingSchoolMainTypeAdapter.context.getResources(), R.drawable.bg_circular_stripes, null));
                drivingSchoolMainItemBinding.drivingSchoolMainItem.setBackground(ResourcesCompat.getDrawable(drivingSchoolMainTypeAdapter.context.getResources(), R.drawable.bg_rectangle_transparent_cr10_t8_red, null));
                drivingSchoolMainItemBinding.bgPrice.setVisibility(0);
            }
            drivingSchoolMainItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.drivingschool.adapters.DrivingSchoolMainTypeAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DrivingSchoolMainTypeAdapter.ViewHolder.bind$lambda$1$lambda$0(drivingSchoolMainTypeAdapter, typeSchool, this, view);
                }
            });
        }

        public static final void bind$lambda$1$lambda$0(DrivingSchoolMainTypeAdapter this$0, DrivingMainType typeSchool, ViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(typeSchool, "$typeSchool");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Function3<DrivingMainType, Integer, View, Unit> mainTypeSchoolClickListener = this$0.getMainTypeSchoolClickListener();
            Integer numValueOf = Integer.valueOf(this$1.getLayoutPosition());
            Intrinsics.checkNotNull(view);
            mainTypeSchoolClickListener.invoke(typeSchool, numValueOf, view);
        }
    }

    public final void setOnlyItemCheck(int thisPosition) {
        int size = this.schoolsTypes.size();
        for (int i = 0; i < size; i++) {
            if (i != thisPosition && this.schoolsTypes.get(i).isCheck()) {
                this.schoolsTypes.get(i).setCheck(false);
                notifyItemChanged(i);
            }
        }
    }
}

