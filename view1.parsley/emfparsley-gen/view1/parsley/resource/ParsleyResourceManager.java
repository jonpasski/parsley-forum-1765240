package view1.parsley.resource;

import model.xcore.View1;
import model.xcore.XcoreFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.parsley.resource.ResourceManager;

@SuppressWarnings("all")
public class ParsleyResourceManager extends ResourceManager {
  private XcoreFactory factory = XcoreFactory.eINSTANCE;
  
  public XcoreFactory getFactory() {
    return this.factory;
  }
  
  public void setFactory(final XcoreFactory factory) {
    this.factory = factory;
  }
  
  @Override
  public void initialize(final Resource it) {
    EList<EObject> _contents = it.getContents();
    View1 _createView1 = this.factory.createView1();
    _contents.add(_createView1);
  }
}
