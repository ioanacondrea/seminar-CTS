package ro.ase.cts.teste;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.categoriiteste.TesteGetPromovabilitate;
import ro.ase.cts.categoriiteste.TesteUrgente;

@RunWith(Categories.class)
@Suite.SuiteClasses({StudentTest.class, TestGrupaMocks.class})
@Categories.IncludeCategory(TesteGetPromovabilitate.class)
@Categories.ExcludeCategory(TesteUrgente.class)
public class SuitaCustom {

}
