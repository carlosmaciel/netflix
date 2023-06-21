import { ISecao } from "../secao/ISecao";

export interface ITitulo {
    id?: number,
    capa: string,
    nome: string,
    relevancia: number,
    idade: number,
    partes: number,
    secao: ISecao
}