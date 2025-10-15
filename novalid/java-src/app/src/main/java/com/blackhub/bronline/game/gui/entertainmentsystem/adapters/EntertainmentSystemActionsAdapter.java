package com.blackhub.bronline.game.gui.entertainmentsystem.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.EntertainmentSystemGamesItemBinding;
import com.blackhub.bronline.game.gui.entertainmentsystem.adapters.EntertainmentSystemActionsAdapter;
import com.blackhub.bronline.game.gui.entertainmentsystem.data.EntertainmentGameData;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: EntertainmentSystemActionsAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001-B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u001f\u001a\u00020\fH\u0016J\u0016\u0010 \u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014H\u0007J\u001c\u0010!\u001a\u00020\u000e2\n\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u001c\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\fH\u0016J\u000e\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\fJ\u000e\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\fJ\u0014\u0010+\u001a\u00020\u000e2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0\u0014RJ\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R_\u0010\u0015\u001aG\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u000e0\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/entertainmentsystem/adapters/EntertainmentSystemActionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/adapters/EntertainmentSystemActionsAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "actionsClickListener", "Lkotlin/Function2;", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/data/EntertainmentGameData;", "Lkotlin/ParameterName;", "name", "action", "", "position", "", "getActionsClickListener", "()Lkotlin/jvm/functions/Function2;", "setActionsClickListener", "(Lkotlin/jvm/functions/Function2;)V", "allGames", "", "buttonClickListener", "Lkotlin/Function3;", "Landroid/view/View;", SVG.View.NODE_NAME, "getButtonClickListener", "()Lkotlin/jvm/functions/Function3;", "setButtonClickListener", "(Lkotlin/jvm/functions/Function3;)V", "oldQueue", "", "getItemCount", "initGames", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCheckOnlyElement", "checkedPosition", "updateGameStatus", "gameId", "updateQueue", "queue", "ViewHolder", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nEntertainmentSystemActionsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntertainmentSystemActionsAdapter.kt\ncom/blackhub/bronline/game/gui/entertainmentsystem/adapters/EntertainmentSystemActionsAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
/* loaded from: classes.dex */
public final class EntertainmentSystemActionsAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;
    public Function2<? super EntertainmentGameData, ? super Integer, Unit> actionsClickListener;

    @NotNull
    public List<EntertainmentGameData> allGames;
    public Function3<? super EntertainmentGameData, ? super Integer, ? super View, Unit> buttonClickListener;

    @NotNull
    public final Context context;

    @NotNull
    public final List<Integer> oldQueue;

    public EntertainmentSystemActionsAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.allGames = CollectionsKt__CollectionsKt.emptyList();
        this.oldQueue = new ArrayList();
    }

    @NotNull
    public final Function2<EntertainmentGameData, Integer, Unit> getActionsClickListener() {
        Function2 function2 = this.actionsClickListener;
        if (function2 != null) {
            return function2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("actionsClickListener");
        return null;
    }

    public final void setActionsClickListener(@NotNull Function2<? super EntertainmentGameData, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.actionsClickListener = function2;
    }

    @NotNull
    public final Function3<EntertainmentGameData, Integer, View, Unit> getButtonClickListener() {
        Function3 function3 = this.buttonClickListener;
        if (function3 != null) {
            return function3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("buttonClickListener");
        return null;
    }

    public final void setButtonClickListener(@NotNull Function3<? super EntertainmentGameData, ? super Integer, ? super View, Unit> function3) {
        Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.buttonClickListener = function3;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void initGames(@NotNull List<EntertainmentGameData> allGames) {
        Intrinsics.checkNotNullParameter(allGames, "allGames");
        this.allGames = allGames;
        notifyDataSetChanged();
    }

    public final void updateQueue(@NotNull List<Integer> queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        if (this.oldQueue.isEmpty()) {
            this.oldQueue.addAll(queue);
            return;
        }
        if (this.oldQueue.size() == queue.size()) {
            int size = this.oldQueue.size();
            for (int i = 0; i < size; i++) {
                if (this.oldQueue.get(i).intValue() != queue.get(i).intValue()) {
                    this.oldQueue.set(i, queue.get(i));
                    notifyItemChanged(i);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        EntertainmentSystemGamesItemBinding entertainmentSystemGamesItemBindingInflate = EntertainmentSystemGamesItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(entertainmentSystemGamesItemBindingInflate, "inflate(...)");
        return new ViewHolder(this, entertainmentSystemGamesItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        EntertainmentGameData entertainmentGameData = (EntertainmentGameData) CollectionsKt___CollectionsKt.getOrNull(this.allGames, position);
        if (entertainmentGameData != null) {
            holder.bind(entertainmentGameData);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.allGames.size();
    }

    /* compiled from: EntertainmentSystemActionsAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/entertainmentsystem/adapters/EntertainmentSystemActionsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/EntertainmentSystemGamesItemBinding;", "(Lcom/blackhub/bronline/game/gui/entertainmentsystem/adapters/EntertainmentSystemActionsAdapter;Lcom/blackhub/bronline/databinding/EntertainmentSystemGamesItemBinding;)V", "bind", "", "action", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/data/EntertainmentGameData;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final EntertainmentSystemGamesItemBinding binding;
        public final /* synthetic */ EntertainmentSystemActionsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull EntertainmentSystemActionsAdapter entertainmentSystemActionsAdapter, EntertainmentSystemGamesItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = entertainmentSystemActionsAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull final EntertainmentGameData action) {
            Intrinsics.checkNotNullParameter(action, "action");
            EntertainmentSystemGamesItemBinding entertainmentSystemGamesItemBinding = this.binding;
            final EntertainmentSystemActionsAdapter entertainmentSystemActionsAdapter = this.this$0;
            if (action.isClicked()) {
                entertainmentSystemGamesItemBinding.bgItemsBorder.setVisibility(0);
            } else {
                entertainmentSystemGamesItemBinding.bgItemsBorder.setVisibility(4);
            }
            entertainmentSystemGamesItemBinding.actionsTitle.setText(action.getGamesName());
            entertainmentSystemGamesItemBinding.itemsIcon.setImageResource(action.getIdIcon());
            if (getBindingAdapterPosition() < entertainmentSystemActionsAdapter.oldQueue.size()) {
                entertainmentSystemGamesItemBinding.valueOfPlayers.setText(entertainmentSystemActionsAdapter.context.getString(R.string.common_current_and_max_values_with_spaces, entertainmentSystemActionsAdapter.oldQueue.get(getBindingAdapterPosition()), 100));
            } else {
                entertainmentSystemGamesItemBinding.valueOfPlayers.setText(entertainmentSystemActionsAdapter.context.getString(R.string.common_current_and_max_values_with_spaces, 0, 100));
            }
            if (action.getStatus() == 0) {
                entertainmentSystemGamesItemBinding.buttonAction.setBackground(ResourcesCompat.getDrawable(entertainmentSystemActionsAdapter.context.getResources(), R.drawable.bg_button_apply, null));
                entertainmentSystemGamesItemBinding.buttonAction.setText(entertainmentSystemActionsAdapter.context.getText(R.string.entertainment_system_button_participate));
            } else {
                entertainmentSystemGamesItemBinding.buttonAction.setBackground(ResourcesCompat.getDrawable(entertainmentSystemActionsAdapter.context.getResources(), R.drawable.bg_button_cancel_actual_style, null));
                entertainmentSystemGamesItemBinding.buttonAction.setText(entertainmentSystemActionsAdapter.context.getText(R.string.common_leave));
            }
            entertainmentSystemGamesItemBinding.buttonAction.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.adapters.EntertainmentSystemActionsAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EntertainmentSystemActionsAdapter.ViewHolder.bind$lambda$2$lambda$0(entertainmentSystemActionsAdapter, action, this, view);
                }
            });
            entertainmentSystemGamesItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.adapters.EntertainmentSystemActionsAdapter$ViewHolder$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EntertainmentSystemActionsAdapter.ViewHolder.bind$lambda$2$lambda$1(entertainmentSystemActionsAdapter, action, this, view);
                }
            });
        }

        public static final void bind$lambda$2$lambda$0(EntertainmentSystemActionsAdapter this$0, EntertainmentGameData action, ViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(action, "$action");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Function3<EntertainmentGameData, Integer, View, Unit> buttonClickListener = this$0.getButtonClickListener();
            Integer numValueOf = Integer.valueOf(this$1.getLayoutPosition());
            Intrinsics.checkNotNull(view);
            buttonClickListener.invoke(action, numValueOf, view);
        }

        public static final void bind$lambda$2$lambda$1(EntertainmentSystemActionsAdapter this$0, EntertainmentGameData action, ViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(action, "$action");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.getActionsClickListener().invoke(action, Integer.valueOf(this$1.getLayoutPosition()));
        }
    }

    public final void setCheckOnlyElement(int checkedPosition) {
        int size = this.allGames.size();
        for (int i = 0; i < size; i++) {
            if (this.allGames.get(i).isClicked() && i != checkedPosition) {
                this.allGames.get(i).setClicked(false);
                notifyItemChanged(i);
            }
        }
    }

    public final void updateGameStatus(int gameId) {
        if (gameId < this.allGames.size()) {
            this.allGames.get(gameId).setStatus(1);
            notifyItemChanged(gameId);
            setCheckOnlyElement(gameId);
        }
    }
}
