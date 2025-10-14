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

