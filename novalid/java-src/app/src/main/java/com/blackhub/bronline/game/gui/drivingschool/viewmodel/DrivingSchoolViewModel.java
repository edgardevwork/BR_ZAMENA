package com.blackhub.bronline.game.gui.drivingschool.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.blackhub.bronline.game.gui.drivingschool.network.DrivingSchoolActionsWithJSON;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* compiled from: DrivingSchoolViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolViewModel;", "Landroidx/lifecycle/ViewModel;", "actionsWithJson", "Lcom/blackhub/bronline/game/gui/drivingschool/network/DrivingSchoolActionsWithJSON;", "(Lcom/blackhub/bronline/game/gui/drivingschool/network/DrivingSchoolActionsWithJSON;)V", "checkType", "", "type", "", "pressButton", "typeOfButton", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class DrivingSchoolViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final DrivingSchoolActionsWithJSON actionsWithJson;

    @Inject
    public DrivingSchoolViewModel(@NotNull DrivingSchoolActionsWithJSON actionsWithJson) {
        Intrinsics.checkNotNullParameter(actionsWithJson, "actionsWithJson");
        this.actionsWithJson = actionsWithJson;
    }

    public final void checkType(int type) throws JSONException {
        this.actionsWithJson.sendCheckType(type);
    }

    public final void pressButton(int typeOfButton) throws JSONException {
        this.actionsWithJson.sendPressButton(typeOfButton);
    }
}
