package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.util.Util;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class LifecycleRequestManagerRetriever {

    @NonNull
    public final RequestManagerRetriever.RequestManagerFactory factory;
    public final Map<androidx.lifecycle.Lifecycle, RequestManager> lifecycleToRequestManager = new HashMap();

    public LifecycleRequestManagerRetriever(@NonNull RequestManagerRetriever.RequestManagerFactory requestManagerFactory) {
        this.factory = requestManagerFactory;
    }

    public RequestManager getOnly(androidx.lifecycle.Lifecycle lifecycle) {
        Util.assertMainThread();
        return this.lifecycleToRequestManager.get(lifecycle);
    }

    public RequestManager getOrCreate(Context context, Glide glide, androidx.lifecycle.Lifecycle lifecycle, FragmentManager fragmentManager, boolean z) {
        Util.assertMainThread();
        RequestManager only = getOnly(lifecycle);
        if (only != null) {
            return only;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
        RequestManager requestManagerBuild = this.factory.build(glide, lifecycleLifecycle, new SupportRequestManagerTreeNode(fragmentManager), context);
        this.lifecycleToRequestManager.put(lifecycle, requestManagerBuild);
        lifecycleLifecycle.addListener(new LifecycleListener() { // from class: com.bumptech.glide.manager.LifecycleRequestManagerRetriever.1
            public final /* synthetic */ androidx.lifecycle.Lifecycle val$lifecycle;

            @Override // com.bumptech.glide.manager.LifecycleListener
            public void onStart() {
            }

            @Override // com.bumptech.glide.manager.LifecycleListener
            public void onStop() {
            }

            public C66351(androidx.lifecycle.Lifecycle lifecycle2) {
                lifecycle = lifecycle2;
            }

            @Override // com.bumptech.glide.manager.LifecycleListener
            public void onDestroy() {
                LifecycleRequestManagerRetriever.this.lifecycleToRequestManager.remove(lifecycle);
            }
        });
        if (z) {
            requestManagerBuild.onStart();
        }
        return requestManagerBuild;
    }

    /* renamed from: com.bumptech.glide.manager.LifecycleRequestManagerRetriever$1 */
    /* loaded from: classes6.dex */
    public class C66351 implements LifecycleListener {
        public final /* synthetic */ androidx.lifecycle.Lifecycle val$lifecycle;

        @Override // com.bumptech.glide.manager.LifecycleListener
        public void onStart() {
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public void onStop() {
        }

        public C66351(androidx.lifecycle.Lifecycle lifecycle2) {
            lifecycle = lifecycle2;
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public void onDestroy() {
            LifecycleRequestManagerRetriever.this.lifecycleToRequestManager.remove(lifecycle);
        }
    }

    /* loaded from: classes6.dex */
    public final class SupportRequestManagerTreeNode implements RequestManagerTreeNode {
        public final FragmentManager childFragmentManager;

        public SupportRequestManagerTreeNode(FragmentManager fragmentManager) {
            this.childFragmentManager = fragmentManager;
        }

        @Override // com.bumptech.glide.manager.RequestManagerTreeNode
        @NonNull
        public Set<RequestManager> getDescendants() {
            HashSet hashSet = new HashSet();
            getChildFragmentsRecursive(this.childFragmentManager, hashSet);
            return hashSet;
        }

        public final void getChildFragmentsRecursive(FragmentManager fragmentManager, Set<RequestManager> set) {
            List<Fragment> fragments = fragmentManager.getFragments();
            int size = fragments.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = fragments.get(i);
                getChildFragmentsRecursive(fragment.getChildFragmentManager(), set);
                RequestManager only = LifecycleRequestManagerRetriever.this.getOnly(fragment.getLifecycle());
                if (only != null) {
                    set.add(only);
                }
            }
        }
    }
}
