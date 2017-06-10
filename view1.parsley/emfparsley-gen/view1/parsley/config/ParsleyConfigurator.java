package view1.parsley.config;

import java.io.File;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.parsley.config.Configurator;
import org.eclipse.emf.parsley.runtime.ui.PluginUtil;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import view1.parsley.ParsleyInjectorProvider;
import view1.parsley.ParsleySaveableTreeFormView;

@SuppressWarnings("all")
public class ParsleyConfigurator extends Configurator {
  public URI resourceURI(final ParsleySaveableTreeFormView it) {
    URI _xblockexpression = null;
    {
      Bundle _bundle = PluginUtil.getBundle(ParsleyInjectorProvider.class);
      final BundleContext bc = _bundle.getBundleContext();
      Bundle _bundle_1 = bc.getBundle();
      final File file = _bundle_1.getDataFile("view1.example");
      String _absolutePath = file.getAbsolutePath();
      _xblockexpression = URI.createFileURI(_absolutePath);
    }
    return _xblockexpression;
  }
}
