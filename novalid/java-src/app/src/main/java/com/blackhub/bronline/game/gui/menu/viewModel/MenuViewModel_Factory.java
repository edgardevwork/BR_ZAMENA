package com.blackhub.bronline.game.gui.menu.viewModel;

import com.blackhub.bronline.game.gui.menu.network.MenuActionsWithJson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class MenuViewModel_Factory implements Factory<MenuViewModel> {
    public final Provider<MenuActionsWithJson> menuActionsWithJsonProvider;

    public MenuViewModel_Factory(Provider<MenuActionsWithJson> menuActionsWithJsonProvider) {
        this.menuActionsWithJsonProvider = menuActionsWithJsonProvider;
    }

    @Override // javax.inject.Provider
    public MenuViewModel get() {
        return newInstance(this.menuActionsWithJsonProvider.get());
    }

    public static MenuViewModel_Factory create(Provider<MenuActionsWithJson> menuActionsWithJsonProvider) {
        return new MenuViewModel_Factory(menuActionsWithJsonProvider);
    }

    public static MenuViewModel newInstance(MenuActionsWithJson menuActionsWithJson) {
        return new MenuViewModel(menuActionsWithJson);
    }
}
