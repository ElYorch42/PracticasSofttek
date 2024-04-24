import { Injectable } from '@angular/core';
import { Inmueble } from '../_modelo/inmueble';

@Injectable({
  providedIn: 'root'
})
export class InmuebleService {

  listaInmuebles:Inmueble[] = [
    {
      id: 1,
      nombre: 'Casa en la playa',
      descripcion:
        'Hermosa casa ubicada frente al mar. Tiene 3 habitaciones, 2 baños y un amplio jardín con acceso privado a la playa.',
      imagenURL:
        'https://blog.selfbank.es/wp-content/uploads/2019/08/GettyImages-576912916.jpg',
    },
    {
      id: 2,
      nombre: 'Apartamento en el centro de la ciudad',
      descripcion:
        'Moderno apartamento en el corazón de la ciudad. Cuenta con 2 dormitorios, 1 baño y una cocina totalmente equipada. Excelente ubicación cerca de tiendas y restaurantes.',
      imagenURL:
        'https://cf.bstatic.com/xdata/images/hotel/max1024x768/424060768.jpg?k=3be6cf07df51cab2dce401cbc7a62be708d6e7429c46653f4c4b0dd762b37b46&o=&hp=1',
    },
    {
      id: 3,
      nombre: 'Finca en el campo',
      descripcion:
        'Encantadora finca rodeada de naturaleza. La propiedad incluye una casa principal de estilo rústico, piscina, establos y vastos terrenos para cultivo o recreación.',
      imagenURL:
        'https://s37805.pcdn.co/fotocasa-life/wp-content/uploads/2020/07/ventajas-vivir-finca-rustica.jpg.optimal.jpg',
    },
    {
      id: 4,
      nombre: 'Piso en zona residencial',
      descripcion:
        'Acogedor piso ubicado en una tranquila zona residencial. Dispone de 1 dormitorio, 1 baño, cocina americana y balcón con vistas panorámicas.',
      imagenURL:
        'https://witei-media.s3.amazonaws.com/pics/3725010-c4e7ec81.jpg',
    },
    {
      id: 5,
      nombre: 'Chalet en las montañas',
      descripcion:
        'Espléndido chalet situado en las montañas. Cuenta con 4 dormitorios, 3 baños, amplio salón con chimenea y terraza con vistas espectaculares.',
      imagenURL:
        'https://www.arquitecturaydiseno.es/medio/2021/08/23/casa-moderna-en-los-bosques-de-canada-5e022697-1500x1080_58fa7c01_1500x1080.jpeg',
    },
  ];

  obtenerUno(id:number):Inmueble | undefined {
    return this.listaInmuebles.find((inmueble) => inmueble.id == id);
  }

  obtenerTodos():Inmueble[] {
    return this.listaInmuebles;
  }

  constructor() { }
}
