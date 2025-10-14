package com.blackhub.bronline.game.gui.socialnetworklink.viewmodel;

import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.socialnetworklink.network.SocialNetworkActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class SocialNetworkLinkViewModel_Factory implements Factory<SocialNetworkLinkViewModel> {
    public final Provider<SocialNetworkActionWithJSON> actionWithJSONProvider;
    public final Provider<StringResource> stringResourceProvider;

    public SocialNetworkLinkViewModel_Factory(Provider<SocialNetworkActionWithJSON> actionWithJSONProvider, Provider<StringResource> stringResourceProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
        this.stringResourceProvider = stringResourceProvider;
    }

    @Override // javax.inject.Provider
    public SocialNetworkLinkViewModel get() {
        return newInstance(this.actionWithJSONProvider.get(), this.stringResourceProvider.get());
    }

    public static SocialNetworkLinkViewModel_Factory create(Provider<SocialNetworkActionWithJSON> actionWithJSONProvider, Provider<StringResource> stringResourceProvider) {
        return new SocialNetworkLinkViewModel_Factory(actionWithJSONProvider, stringResourceProvider);
    }

    public static SocialNetworkLinkViewModel newInstance(SocialNetworkActionWithJSON actionWithJSON, StringResource stringResource) {
        return new SocialNetworkLinkViewModel(actionWithJSON, stringResource);
    }
}
