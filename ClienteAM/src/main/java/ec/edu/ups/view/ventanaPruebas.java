package ec.edu.ups.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import ec.edu.ups.business.*;
import ec.edu.ups.business.InscripcionONRemote;
import ec.edu.ups.business.PersonaONRemote;
import ec.edu.ups.model.*;



public class ventanaPruebas {
	
	private PersonaONRemote personaRemote;
	private InscripcionONRemote inscripcionesRemote;
	private DocenteONRemote docenteRemote;
	private espacioFisicoONRemote espacioFisicoRemote;
	private CalificacionONRemote calificacionRemote;
	private EstudianteONRemote estudianteRemote;
	private FacturaONRemote facturaRemote;
	private GrupoONRemote grupoRemote;
	private HorarioONRemote horarioRemote;
	private IniciarSesionONRemote iniciarSesionRemote;
	private LibroDiarioONRemote libroDiarioRemote;
	private MallaCurricularONRemote mallaCurricularRemote;
	private MateriaONRemote materiaRemote;
	private MatriculaONRemote matriculaRemote;
	private OfertaAcademicaONRemote ofertaAcademicaRemote;
	
	
	public void conectar() throws Exception {
		try {  
            final Hashtable<String, Comparable> jndiProperties =  
                    new Hashtable<String, Comparable>();  
            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,  
                    "org.wildfly.naming.client.WildFlyInitialContextFactory");  
            jndiProperties.put("jboss.naming.client.ejb.context", true);  
              
            jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");  
            jndiProperties.put(Context.SECURITY_PRINCIPAL, "demo");  
            jndiProperties.put(Context.SECURITY_CREDENTIALS, "demo");  
              
            final Context context = new InitialContext(jndiProperties);  
              
            final String lookupName = "ejb:/AcademiaMilitar/CalificacionON!ec.edu.ups.business.CalificacionONRemote";  
            
            this.calificacionRemote = (CalificacionONRemote) context.lookup(lookupName);  
             
            final String lookupName2 = "ejb:/AcademiaMilitar/MallaCurricularON!ec.edu.ups.business.MallaCurricularONRemote";  
            
            this.mallaCurricularRemote = (MallaCurricularONRemote) context.lookup(lookupName2);  
            
            final String lookupName3 = "ejb:/AcademiaMilitar/HorarioON!ec.edu.ups.business.HorarioONRemote";  
            
            this.horarioRemote = (HorarioONRemote) context.lookup(lookupName3);
             
            final String lookupName4 = "ejb:/AcademiaMilitar/InscripcionON!ec.edu.ups.business.InscripcionONRemote";  
            
            this.inscripcionesRemote = (InscripcionONRemote) context.lookup(lookupName4);  
            
            final String lookupName5 = "ejb:/AcademiaMilitar/espacioFisicoON!ec.edu.ups.business.espacioFisicoONRemote";  
            
            this.espacioFisicoRemote = (espacioFisicoONRemote) context.lookup(lookupName5);  
             
            final String lookupName6 = "ejb:/AcademiaMilitar/EstudianteON!ec.edu.ups.business.EstudianteONRemote";  
            
            this.estudianteRemote = (EstudianteONRemote) context.lookup(lookupName6);  
            final String lookupName7 = "ejb:/AcademiaMilitar/LibroDiarioON!ec.edu.ups.business.LibroDiarioONRemote";  
            
            this.libroDiarioRemote = (LibroDiarioONRemote) context.lookup(lookupName7);  
             
            final String lookupName8 = "ejb:/AcademiaMilitar/IniciarSesionON!ec.edu.ups.business.IniciarSesionONRemote";  
            
            this.iniciarSesionRemote = (IniciarSesionONRemote) context.lookup(lookupName8);  
            final String lookupName9 = "ejb:/AcademiaMilitar/MatriculaON!ec.edu.ups.business.MatriculaONRemote";  
            
            this.matriculaRemote = (MatriculaONRemote) context.lookup(lookupName9);  
             
            final String lookupName10 = "ejb:/AcademiaMilitar/FacturaON!ec.edu.ups.business.FacturaONRemote";  
            
            this.facturaRemote = (FacturaONRemote) context.lookup(lookupName10);  
            
            final String lookupName11 = "ejb:/AcademiaMilitar/GrupoON!ec.edu.ups.business.GrupoONRemote";  
            
            this.grupoRemote = (GrupoONRemote) context.lookup(lookupName11);  
             
            final String lookupName12 = "ejb:/AcademiaMilitar/DocenteON!ec.edu.ups.business.DocenteONRemote";  
            
            this.docenteRemote = (DocenteONRemote) context.lookup(lookupName12); 
            final String lookupName13 = "ejb:/AcademiaMilitar/PersonaON!ec.edu.ups.business.PersonaONRemote";  
            
            this.personaRemote = (PersonaONRemote) context.lookup(lookupName13);  
             
            final String lookupName14 = "ejb:/AcademiaMilitar/MateriaON!ec.edu.ups.business.MateriaONRemote";  
            
            this.materiaRemote = (MateriaONRemote) context.lookup(lookupName14);  
            
            final String lookupName15 = "ejb:/AcademiaMilitar/OfertaAcademicaON!ec.edu.ups.business.OfertaAcademicaONRemote";  
            
            this.ofertaAcademicaRemote = (OfertaAcademicaONRemote) context.lookup(lookupName15);
            } catch (Exception ex) {  
            ex.printStackTrace();  
            throw ex;  
        }  
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("cuenca");
		ventanaPruebas v = new ventanaPruebas();
		v.conectar();
		//***********************************************METODOS A PROBAR*****************************************************
		//v.CrearPersona();
		//v.crearCalificacion();
		//v.CrearDocente();
		// v.crearEstudiante();
		//v.crearFactura();
		//v.crearGrupo();
		//v.crearIniciarSesion();
		//v.crearLibroDiario();
		// v.crearMallaCurricular();
		//v.crearOfertaAcademica();
	
	}

	public void CrearInscripcion() {
		Persona p = new Persona();
		p.setCedula("0107845159");
		p.setNombres("Danny Gustavo");
		p.setApellidos("Yunga Yunga");
		p.setCelular("0984747152");
		p.setDireccion("ECU 911");
		p.setFechaNacimiento(new Date());
		p.setGenero("Hombre");
		
		
		//PerOn.insertar(p);
		
		Inscripcion i = new Inscripcion();
		i.setCarrera("Computación");
		i.setFechaRegistro(new Date());
		i.setJornada("Matutina");
		i.setModalidad("Presencial");
		i.setPeriodoLectivo("Periodo 59");
		i.setPersona(p);
		
		try {
			inscripcionesRemote.insertar(i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		System.out.println("Inscripcion Insertado");
	}
	
	public void CrearPersona() {
		Persona p = new Persona();
		p.setCedula("1401063217");
		p.setNombres("Jordi Manuel");
		p.setApellidos("Ener Gonzales");
		p.setCelular("0939889081");
		p.setDireccion("Monay");
		p.setFechaNacimiento(new Date());
		p.setGenero("Hombre");
		
		
		try {
			personaRemote.insertar(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		System.out.println("Persona Insertado");
	}
	
	public void crearCalificacion() {
		Calificacion calificacion = new Calificacion();
	
		calificacion.setNotaObtenida(98.0);
		
		Grupo grupo = new Grupo();
		grupo.setNivel(5);
		calificacion.setGrupo(grupo);
		
		Estudiante estudiante = new Estudiante();
		estudiante.setCicloCursando(8);
		calificacion.setEstudiante(estudiante);
		
		try {
			calificacionRemote.insertar(calificacion);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		System.out.println("Calificacion inserta Insertado");
		
	}
	
	public void CrearDocente() {
    	List<Grupo> listGrupo = new ArrayList<Grupo>();
    	List<Materia> listMateria = new ArrayList<Materia>();
    	Docente docente = new Docente();
    	Persona persona = new Persona();
    	Grupo grupo = new Grupo();
    	Materia materia = new Materia();
    	
    	persona.setCedula("1234567896");
    	//grupo.setId(1);
    	listGrupo.add(grupo);
    	//materia.setId(1);
    	listMateria.add(materia);
    	//docente.setId(1);
    
    	
    	
    	docente.setTitulo("Ingeniero");
    	docente.setGradoTiulo("Cuarto Nivel");
    	docente.setEspecializacion("CyberSeguridad");
    	docente.setPersona(persona);
    	//	docente.setGrupos(listGrupo);
    	//docente.setMateria(listMateria);
    	
    	try {
			docenteRemote.insertar(docente);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		System.out.println("Docente Insertado");
    }
     
	public void crearEspaciosFisicos() {
		 EspacioFisico espacioFisico = new EspacioFisico();
		 //espacioFisico.setId(1);
		 espacioFisico.setNombreEdificio("Mario Rizzini");
		 espacioFisico.setNumeroAula(24);
		 
		 Grupo grupo = new Grupo();
		 grupo.setNivel(5);
		 espacioFisico.setGrupo(grupo);
		 
		 try {
				espacioFisicoRemote.insertar(espacioFisico);;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			System.out.println("EspaciosFisicosInsertado");
	}
    
     
    public void crearEstudiante() {
    	Estudiante estudiante = new Estudiante();
    	Persona persona = new Persona();
    	
    	
    	
    	estudiante.setCicloCursando(5);
    	persona.setCedula("0123456781");
    	estudiante.setPersona(persona);
    	try {
			estudianteRemote.insertar(estudiante);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		System.out.println("Estudiante Insertado");
    }
    
    
    
     
	public void crearFactura() {
		List<LibroDiario> libroDiario = new ArrayList<LibroDiario>();
		Date fecha = new Date();
		Factura factura = new Factura();
		//factura.setId(1);
		factura.setCedula("0105599823");
		factura.setNombre("Joseph Reinoso");
		factura.setCorreo("joreinoso39@gmail.com");
		factura.setTelefono("4040801");
		factura.setDireccion("Monay");
		factura.setFecha(fecha);
		factura.setDetalle("Matricula Periodo 59");
		factura.setIva(120);
		factura.setSubtotal(1080);
		factura.setTotal(1200);
		
		LibroDiario libroDiarios = new LibroDiario();
		libroDiarios.setId(1);
		libroDiario.add(libroDiarios);
		
		factura.setLibroDiarios(libroDiario);
		
		try {
			facturaRemote.insertar(factura);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		System.out.println("factura Insertado");
	}
    
    
    
     
    public void crearGrupo() {
    	
    	Grupo grupo = new Grupo();
    	Docente docente = new Docente();
    	Materia materia = new Materia();

    	grupo.setNumeroGrupo(5);
    	grupo.setNivel(4);
    	
    	docente.setEspecializacion("5");
    	grupo.setDocente(docente);
    	materia.setNivel(5);
    	grupo.setMateria(materia);
    	
    	
    	
    	try {
			grupoRemote.insertar(grupo);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		System.out.println("grupo Insertado");
    	
    }
    
    
     
	public void crearHorario() {
		Horario horario = new Horario();
		horario.setHora("08H00 - 10H00");
		horario.setDia("Lunes");
		
		Grupo grupo = new Grupo();
		grupo.setNivel(5);
		horario.setGrupo(grupo);
		
		EspacioFisico espaciosFisico = new EspacioFisico();
		espaciosFisico.setNombreEdificio("Edificio El Bicho");
		horario.setEspacio(espaciosFisico);
		
		try {
			horarioRemote.insertar(horario);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		System.out.println("horario Insertado");
	}
    
     
    public void crearIniciarSesion() {
    	IniciarSesion iniciarsesion = new IniciarSesion();
    	iniciarsesion.setUsuario("liomessi@est.ups.edu.ec");
    	iniciarsesion.setContrasenia("Argentina");
    	
    	try {
			iniciarSesionRemote.insertar(iniciarsesion);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		System.out.println("Sesion Insertado");
    }
    
 
    public void crearLibroDiario() {
    	Date fecha = new Date();
    	LibroDiario librodiario= new LibroDiario();
    	Factura factura = new Factura();
    	librodiario.setFecha(fecha);
    	librodiario.setValorTotal(45.5);
    	factura.setDetalle("Matricula Periodo 60");
    	librodiario.setFactura(factura);
    	
    	try {
			libroDiarioRemote.insertar(librodiario);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		System.out.println("libroDiario Insertado");

    }
    
      
    public void crearMallaCurricular() {
    	MallaCurricular mallacurricular = new MallaCurricular();
   
    	mallacurricular.setNivel(5);
    	mallacurricular.setAsignatura("Ecuaciones Diferenciales");
    	mallacurricular.setHoras(100);
    	
    	try {
			mallaCurricularRemote.insertar(mallacurricular);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		System.out.println("malla curricular Insertado");
    }
    

    
       
    public void crearMateria() {
    	List<Grupo> listGrupo = new ArrayList<Grupo>();
    
    	Matricula matricula = new Matricula();
    	Materia materia = new Materia();
    	Docente docente = new Docente();
    	Grupo grupo = new Grupo();
    	
 
    	materia.setNombre("Ingenieria en Software");
    	materia.setNivel(5);
    	
    	docente.setTitulo("Ingenieria en Computacion");
    	grupo.setNivel(8);
    	listGrupo.add(grupo);
    	
    	materia.setDocente(docente);
    	materia.setGrupos(listGrupo);
    	
    	
    	try {
			materiaRemote.insertar(materia);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		System.out.println("Materia Insertado");
    }
   
      
     
     public void crearOfertaAcademica() {
    	 List<Matricula>listMatricula = new ArrayList<Matricula>();
    	 OfertaAcademica ofertaacademica = new OfertaAcademica();
    	 MallaCurricular mallacurricular = new MallaCurricular();
    	 Matricula matricula = new Matricula();
    	 
    	 
    
    	 ofertaacademica.setNombreCarrera("Computacion");
    	 ofertaacademica.setCiclos(5);
    	 ofertaacademica.setModalidad("Presencial");
    	 mallacurricular.setAsignatura("Sistemas Embebidos");
    	 ofertaacademica.setMallaCurricular(mallacurricular);
    	 
    	 try {
 			ofertaAcademicaRemote.insertar(ofertaacademica);
 		} catch (Exception e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 		
 	
 		System.out.println("OfertaAcademica Insertado");
    	 

     }
}
