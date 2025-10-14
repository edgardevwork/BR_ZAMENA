package com.blackhub.bronline.game.gui.familysystem.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FamiliesUpgradeParentItemBinding;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.familysystem.data.FamilyUpgradeValueData;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FamilyUpgradeParentItemAdapter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class FamilyUpgradeParentItemAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    @Nullable
    public FamilyUpgradeChildItemAdapter childAdapter;

    @NotNull
    public final List<Integer> levels;

    @Nullable
    public final JNIActivity mainActivity;

    @NotNull
    public final List<FamilyUpgradeValueData> upgradeCurrentValueList;

    @NotNull
    public final List<FamilyUpgradeValueData> upgradeNewValueList;

    public FamilyUpgradeParentItemAdapter(@NotNull List<Integer> levels, @NotNull List<FamilyUpgradeValueData> upgradeCurrentValueList, @NotNull List<FamilyUpgradeValueData> upgradeNewValueList, @Nullable JNIActivity jNIActivity) {
        Intrinsics.checkNotNullParameter(levels, "levels");
        Intrinsics.checkNotNullParameter(upgradeCurrentValueList, "upgradeCurrentValueList");
        Intrinsics.checkNotNullParameter(upgradeNewValueList, "upgradeNewValueList");
        this.levels = levels;
        this.upgradeCurrentValueList = upgradeCurrentValueList;
        this.upgradeNewValueList = upgradeNewValueList;
        this.mainActivity = jNIActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FamiliesUpgradeParentItemBinding familiesUpgradeParentItemBindingInflate = FamiliesUpgradeParentItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(familiesUpgradeParentItemBindingInflate, "inflate(...)");
        return new ViewHolder(this, familiesUpgradeParentItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.levels.get(position).intValue(), position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.levels.size();
    }

    /* compiled from: FamilyUpgradeParentItemAdapter.kt */
    @Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/familysystem/adapters/FamilyUpgradeParentItemAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/FamiliesUpgradeParentItemBinding;", "(Lcom/blackhub/bronline/game/gui/familysystem/adapters/FamilyUpgradeParentItemAdapter;Lcom/blackhub/bronline/databinding/FamiliesUpgradeParentItemBinding;)V", "bind", "", "level", "", "position", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final FamiliesUpgradeParentItemBinding binding;
        public final /* synthetic */ FamilyUpgradeParentItemAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull FamilyUpgradeParentItemAdapter familyUpgradeParentItemAdapter, FamiliesUpgradeParentItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = familyUpgradeParentItemAdapter;
            this.binding = binding;
        }

        public final void bind(int level, int position) {
            FamilyUpgradeChildItemAdapter familyUpgradeChildItemAdapter;
            FamiliesUpgradeParentItemBinding familiesUpgradeParentItemBinding = this.binding;
            FamilyUpgradeParentItemAdapter familyUpgradeParentItemAdapter = this.this$0;
            TextView textView = familiesUpgradeParentItemBinding.potentialValue;
            JNIActivity jNIActivity = familyUpgradeParentItemAdapter.mainActivity;
            textView.setText(jNIActivity != null ? jNIActivity.getString(R.string.families_upgrade_level, Integer.valueOf(level)) : null);
            familiesUpgradeParentItemBinding.potentialValue.setSelected(true);
            if (position == 1) {
                familyUpgradeChildItemAdapter = new FamilyUpgradeChildItemAdapter(familyUpgradeParentItemAdapter.upgradeNewValueList, familyUpgradeParentItemAdapter.mainActivity);
            } else {
                familyUpgradeChildItemAdapter = new FamilyUpgradeChildItemAdapter(familyUpgradeParentItemAdapter.upgradeCurrentValueList, familyUpgradeParentItemAdapter.mainActivity);
            }
            familyUpgradeParentItemAdapter.childAdapter = familyUpgradeChildItemAdapter;
            RecyclerView recyclerView = familiesUpgradeParentItemBinding.upgradeValues;
            recyclerView.setLayoutManager(new LinearLayoutManager(familiesUpgradeParentItemBinding.getRoot().getContext(), 1, false));
            recyclerView.setAdapter(familyUpgradeParentItemAdapter.childAdapter);
        }
    }
}

