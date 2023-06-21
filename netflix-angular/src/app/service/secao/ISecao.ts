import { ITitulo } from "../titulo/ITitulo";

export interface ISecao {
    id?: number,
    nome: string,
    titulos: ITitulo[]
}