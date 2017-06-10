package view1.parsley;

import com.google.inject.Injector;
import org.eclipse.emf.parsley.runtime.ui.AbstractGuiceAwareExecutableExtensionFactory;
import view1.parsley.ParsleyInjectorProvider;

@SuppressWarnings("all")
public class ParsleyExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
  @Override
  public Injector getInjector() throws Exception {
    return ParsleyInjectorProvider.getInjector();
  }
}
