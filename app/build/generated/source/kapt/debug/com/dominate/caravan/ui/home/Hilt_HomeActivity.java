package com.dominate.caravan.ui.home;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.dominate.caravan.core.base.BaseActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.Override;
import javax.annotation.Generated;

/**
 * A generated base class to be extended by the @dagger.hilt.android.AndroidEntryPoint annotated class. If using the Gradle plugin, this is swapped as the base class via bytecode transformation.
 */
@Generated("dagger.hilt.android.processor.internal.androidentrypoint.ActivityGenerator")
public abstract class Hilt_HomeActivity extends BaseActivity {
  private boolean injected = false;

  @CallSuper
  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    inject();
    super.onCreate(savedInstanceState);
  }

  protected void inject() {
    if (!injected) {
      injected = true;
      ((HomeActivity_GeneratedInjector) UnsafeCasts.<GeneratedComponentManagerHolder>unsafeCast(this).generatedComponent()).injectHomeActivity(UnsafeCasts.<HomeActivity>unsafeCast(this));
    }
  }
}
