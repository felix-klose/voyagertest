// Generated by Dagger (https://dagger.dev).
package com.example.voagertest.feature.feature2.view.navigation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityRetainedScoped")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Feature2NavigationTarget_Factory implements Factory<Feature2NavigationTarget> {
  @Override
  public Feature2NavigationTarget get() {
    return newInstance();
  }

  public static Feature2NavigationTarget_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Feature2NavigationTarget newInstance() {
    return new Feature2NavigationTarget();
  }

  private static final class InstanceHolder {
    private static final Feature2NavigationTarget_Factory INSTANCE = new Feature2NavigationTarget_Factory();
  }
}
