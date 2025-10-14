package com.blackhub.bronline.game.gui.tutorialhints;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.HintItemBinding;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TutorialAdapter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class TutorialAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public final Context currentContext;

    @NotNull
    public List<HintQuestData> questsList;

    public TutorialAdapter(@NotNull Context currentContext) {
        Intrinsics.checkNotNullParameter(currentContext, "currentContext");
        this.currentContext = currentContext;
        this.questsList = CollectionsKt__CollectionsKt.emptyList();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setQuests(@NotNull List<HintQuestData> questsList) {
        Intrinsics.checkNotNullParameter(questsList, "questsList");
        this.questsList = questsList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        HintItemBinding hintItemBindingInflate = HintItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(hintItemBindingInflate, "inflate(...)");
        return new ViewHolder(this, hintItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.questsList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.questsList.size();
    }

    /* compiled from: TutorialAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/HintItemBinding;", "(Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialAdapter;Lcom/blackhub/bronline/databinding/HintItemBinding;)V", "bind", "", "quest", "Lcom/blackhub/bronline/game/gui/tutorialhints/HintQuestData;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final HintItemBinding binding;
        public final /* synthetic */ TutorialAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull TutorialAdapter tutorialAdapter, HintItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = tutorialAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull HintQuestData quest) {
            Intrinsics.checkNotNullParameter(quest, "quest");
            HintItemBinding hintItemBinding = this.binding;
            TutorialAdapter tutorialAdapter = this.this$0;
            Drawable drawableMutate = hintItemBinding.hintProgressQuest.getProgressDrawable().mutate();
            Intrinsics.checkNotNullExpressionValue(drawableMutate, "mutate(...)");
            if (quest.getIfMainQuest()) {
                drawableMutate.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(R.color.light_yellow, BlendModeCompat.SRC_ATOP));
                hintItemBinding.hintProgressQuest.setProgressDrawable(drawableMutate);
            } else {
                drawableMutate.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(R.color.light_green, BlendModeCompat.SRC_ATOP));
                hintItemBinding.hintProgressQuest.setProgressDrawable(drawableMutate);
            }
            hintItemBinding.hintTitleAdditionalQuestItem.setText(quest.getQuestsText());
            hintItemBinding.hintStatusQuest.setText(tutorialAdapter.currentContext.getString(R.string.common_number_current_number_max, Integer.valueOf(quest.getThisQuestsStatus()), Integer.valueOf(quest.getMaxQuestsStatus())));
            if (quest.getThisQuestsStatus() == quest.getMaxQuestsStatus()) {
                TextView textView = hintItemBinding.hintTitleAdditionalQuestItem;
                textView.setPaintFlags(textView.getPaintFlags() | 16);
            }
            hintItemBinding.hintProgressQuest.setMax(quest.getMaxQuestsStatus());
            hintItemBinding.hintProgressQuest.setProgress(quest.getThisQuestsStatus());
        }
    }
}

