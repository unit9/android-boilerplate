// Code generated by dagger-compiler.  Do not edit.
package com.unit9.boilerplate.network.Login;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binding<LoginNetwork>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 *
 * Owning the dependency links between {@code LoginNetwork} and its
 * dependencies.
 *
 * Being a {@code Provider<LoginNetwork>} and handling creation and
 * preparation of object instances.
 *
 * Being a {@code MembersInjector<LoginNetwork>} and handling injection
 * of annotated fields.
 */
public final class LoginNetwork$$InjectAdapter extends Binding<LoginNetwork>
    implements Provider<LoginNetwork>, MembersInjector<LoginNetwork> {
  private Binding<com.unit9.boilerplate.network.HttpManager> mHttpManager;

  public LoginNetwork$$InjectAdapter() {
    super("com.unit9.boilerplate.network.Login.LoginNetwork", "members/com.unit9.boilerplate.network.Login.LoginNetwork", NOT_SINGLETON, LoginNetwork.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    mHttpManager = (Binding<com.unit9.boilerplate.network.HttpManager>) linker.requestBinding("com.unit9.boilerplate.network.HttpManager", LoginNetwork.class, getClass().getClassLoader());
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(mHttpManager);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<LoginNetwork>}.
   */
  @Override
  public LoginNetwork get() {
    LoginNetwork result = new LoginNetwork();
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<LoginNetwork>}.
   */
  @Override
  public void injectMembers(LoginNetwork object) {
    object.mHttpManager = mHttpManager.get();
  }

}