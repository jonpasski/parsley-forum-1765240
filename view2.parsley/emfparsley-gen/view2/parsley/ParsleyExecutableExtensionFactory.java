package view2.parsley;

import com.google.inject.Injector;
import org.eclipse.emf.parsley.runtime.ui.AbstractGuiceAwareExecutableExtensionFactory;
import view2.parsley.ParsleyInjectorProvider;

@SuppressWarnings("all")
public class ParsleyExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
  @Override
  public Injector getInjector() throws Exception {
    return ParsleyInjectorProvider.getInjector();
  }
}
