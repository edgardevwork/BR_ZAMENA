package com.blackhub.bronline.game.core;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewManager;

/* compiled from: R8$$SyntheticClass */

public final /* synthetic */ class JNIActivity$$ExternalSyntheticLambda8 implements OnCompleteListener {
    public final /* synthetic */ JNIActivity f$0;
    public final /* synthetic */ ReviewManager f$1;

    public /* synthetic */ JNIActivity$$ExternalSyntheticLambda8(JNIActivity jNIActivity, ReviewManager reviewManager) {
        this.f$0 = jNIActivity;
        this.f$1 = reviewManager;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f$0.lambda$setObservers$1(this.f$1, task);
    }
}
