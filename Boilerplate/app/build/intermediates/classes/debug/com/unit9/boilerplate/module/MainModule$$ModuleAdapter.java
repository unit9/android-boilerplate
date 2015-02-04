// Code generated by dagger-compiler.  Do not edit.
package com.unit9.boilerplate.module;

import dagger.internal.BindingsGroup;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class MainModule$$ModuleAdapter extends ModuleAdapter<MainModule> {
  private static final String[] INJECTS = { "members/com.unit9.boilerplate.activity.MainActivity", "members/com.unit9.boilerplate.network.Login.LoginNetwork", "members/com.unit9.boilerplate.network.HttpManager", "members/com.unit9.boilerplate.App", };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { };

  public MainModule$$ModuleAdapter() {
    super(com.unit9.boilerplate.module.MainModule.class, INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, true /*complete*/, false /*library*/);
  }

  @Override
  public MainModule newModule() {
    return new com.unit9.boilerplate.module.MainModule();
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getBindings(BindingsGroup bindings, MainModule module) {
    bindings.contributeProvidesBinding("com.unit9.boilerplate.util.Log", new ProvidePrintProvidesAdapter(module));
    bindings.contributeProvidesBinding("com.unit9.boilerplate.network.Login.LoginNetwork", new ProvideLoginNetworkProvidesAdapter(module));
  }

  /**
   * A {@code Binding<com.unit9.boilerplate.util.Log>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Being a {@code Provider<com.unit9.boilerplate.util.Log>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvidePrintProvidesAdapter extends ProvidesBinding<com.unit9.boilerplate.util.Log>
      implements Provider<com.unit9.boilerplate.util.Log> {
    private final MainModule module;

    public ProvidePrintProvidesAdapter(MainModule module) {
      super("com.unit9.boilerplate.util.Log", IS_SINGLETON, "com.unit9.boilerplate.module.MainModule", "providePrint");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.unit9.boilerplate.util.Log>}.
     */
    @Override
    public com.unit9.boilerplate.util.Log get() {
      return module.providePrint();
    }
  }

  /**
   * A {@code Binding<com.unit9.boilerplate.network.Login.LoginNetwork>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Being a {@code Provider<com.unit9.boilerplate.network.Login.LoginNetwork>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideLoginNetworkProvidesAdapter extends ProvidesBinding<com.unit9.boilerplate.network.Login.LoginNetwork>
      implements Provider<com.unit9.boilerplate.network.Login.LoginNetwork> {
    private final MainModule module;

    public ProvideLoginNetworkProvidesAdapter(MainModule module) {
      super("com.unit9.boilerplate.network.Login.LoginNetwork", IS_SINGLETON, "com.unit9.boilerplate.module.MainModule", "provideLoginNetwork");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.unit9.boilerplate.network.Login.LoginNetwork>}.
     */
    @Override
    public com.unit9.boilerplate.network.Login.LoginNetwork get() {
      return module.provideLoginNetwork();
    }
  }
}
