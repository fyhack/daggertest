package com.elclcd.dagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * AppliactionComponent
 * <p>
 *
 * @author elc_simayi
 * @since 2016/11/8
 */

@Singleton
@Component(modules = AppliactionModule.class)
public interface AppliactionComponent {
    void inject(MyApplication application);
}
